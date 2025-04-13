package com.example.tugas2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailImage: ImageView = findViewById(R.id.detailImage)
        val detailTitle: TextView = findViewById(R.id.detailTitle)
        val detailCountry: TextView = findViewById(R.id.detailDesc)
        val detailDescription: TextView = findViewById(R.id.detailDesc2)

        // Ambil data yang dikirim lewat Intent
        val itemData = intent.getParcelableExtra<ItemDataActivity>("itemDetail")
        if (itemData != null) {
            detailImage.setImageResource(itemData.gambar)
            detailTitle.text = itemData.nama
            detailCountry.text = itemData.asal
            detailDescription.text = itemData.deskripsi
        }
    }
}
