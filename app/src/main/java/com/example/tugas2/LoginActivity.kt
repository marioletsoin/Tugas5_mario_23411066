package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.tugas2.databinding.ActivityLoginBinding

class LoginActivity : ComponentActivity() {
    private lateinit var binding: ActivityLoginBinding
    private var isPasswordVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bSignInlogin.setOnClickListener {
            val intentHome = Intent(this, PilihanActivity::class.java)
            startActivity(intentHome)

            Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
        }

        binding.tVforgotpwlogin.setOnClickListener {
            val intentHome = Intent(this, ForgotpwActivity::class.java)
            startActivity(intentHome)
        }

        binding.tVdonthavepwlogin.setOnClickListener {
            val intentHome = Intent(this, RegisterActivity::class.java)
            startActivity(intentHome)
        }

        binding.iVBacklogin.setOnClickListener {
            val intentHome = Intent(this, MainActivity::class.java)
            startActivity(intentHome)
        }

        // Toggle Password Visibility
        binding.iVmatalogin.setOnClickListener {
            isPasswordVisible = !isPasswordVisible
            if (isPasswordVisible) {
                // Tampilkan password
                binding.eTpwlogin.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                binding.iVmatalogin.setImageResource(R.drawable.openeye) // Pastikan file `openeye.png` ada di `res/drawable`
            } else {
                // Sembunyikan password
                binding.eTpwlogin.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                binding.iVmatalogin.setImageResource(R.drawable.closeeye) // Pastikan file `closeeye.png` ada di `res/drawable`
            }
            // Pindahkan kursor ke akhir teks setelah perubahan
            binding.eTpwlogin.setSelection(binding.eTpwlogin.text.length)
        }
    }
}
