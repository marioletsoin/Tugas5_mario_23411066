package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tugas2.databinding.ActivityPilihanBinding

class PilihanActivity : ComponentActivity() {
    private lateinit var binding: ActivityPilihanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPilihanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iVbackmenu2.setOnClickListener {
            val intentHome = Intent(this, LoginActivity::class.java)
            startActivity(intentHome)
        }

        binding.bsendemailmenu2.setOnClickListener {
            val intentHome = Intent(this, MenuActivity::class.java)
            startActivity(intentHome)
        }

        binding.bsendemailmenu3.setOnClickListener {
            val intentHome = Intent(this, RcviewActivity::class.java)
            startActivity(intentHome)
        }
    }
}