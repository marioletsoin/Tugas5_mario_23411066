package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.tugas2.databinding.ActivityMenuBinding

class MenuActivity : ComponentActivity() {
    private lateinit var binding: ActivityMenuBinding
    private var isReturningFromEmail = false  // Menandai apakah kembali dari email

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol kembali ke MainActivity
        binding.iVbackmenu.setOnClickListener {
            val intentHome = Intent(this, PilihanActivity::class.java)
            startActivity(intentHome)
        }

        // Tombol kirim email
        binding.bsendemailmenu.setOnClickListener {
            val email = binding.eTemailmenu.text.toString()
            val subject = binding.eTsubjectmenu.text.toString()
            val message = binding.eTmessagemenu.text.toString()

            if (email.isNotEmpty() && subject.isNotEmpty() && message.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "message/rfc822"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                    putExtra(Intent.EXTRA_SUBJECT, subject)
                    putExtra(Intent.EXTRA_TEXT, message)
                }

                try {
                    startActivity(Intent.createChooser(intent, "Pilih aplikasi email"))
                    isReturningFromEmail = true  // Menandai bahwa pengguna akan kembali dari Gmail
                } catch (e: Exception) {
                    Toast.makeText(this, "Tidak ada aplikasi email yang tersedia", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Harap isi semua kolom", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Menampilkan Toast & mengosongkan EditText saat kembali ke aplikasi
    override fun onResume() {
        super.onResume()
        if (isReturningFromEmail) {
            Toast.makeText(this, "Email berhasil dikirim", Toast.LENGTH_SHORT).show()
            isReturningFromEmail = false  // Reset supaya tidak terus muncul

            // Kosongkan EditText setelah kembali ke aplikasi
            binding.eTemailmenu.setText("")
            binding.eTsubjectmenu.setText("")
            binding.eTmessagemenu.setText("")
        }
    }
}
