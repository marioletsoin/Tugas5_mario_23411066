package com.example.tugas2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemDataActivity(
    val gambar: Int,
    val nama: String,
    val asal: String,
    val deskripsi: String   // Field deskripsi ditambahkan
) : Parcelable
