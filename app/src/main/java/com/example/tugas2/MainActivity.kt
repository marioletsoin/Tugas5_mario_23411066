package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugas2.databinding.ActivityMainBinding
import com.example.tugas2.ui.theme.TUGAS2Theme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bSignInmain.setOnClickListener {
            val intentHome = Intent(this, LoginActivity::class.java)
            startActivity(intentHome)
        }

        binding.bCAmain.setOnClickListener {
            val intentHome = Intent(this, RegisterActivity::class.java)
            startActivity(intentHome)


         }
    }
}


