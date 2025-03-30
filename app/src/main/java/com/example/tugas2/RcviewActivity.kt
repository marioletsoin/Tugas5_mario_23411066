package com.example.tugas2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.ActivityRcviewBinding


class RcviewActivity : ComponentActivity() {
    private lateinit var binding: ActivityRcviewBinding
    private lateinit var pemainbolaRecyclerView: RecyclerView
    private lateinit var pemainbolaAdapter: MyAdapterActivity
    private lateinit var listpemainbola: ArrayList<ItemDataActivity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcview)
        binding = ActivityRcviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iVbackrcview.setOnClickListener {
            val intentHome = Intent(this, PilihanActivity::class.java)
            startActivity(intentHome)
        }

        pemainbolaRecyclerView = findViewById(R.id.PemainbolaRV)
        listpemainbola = ArrayList()

        listpemainbola.add(ItemDataActivity(R.drawable.cr7, nama = "CRISTIANO RONALDO", asal = "PORTUGAL"))
        listpemainbola.add(ItemDataActivity(R.drawable.lmessi, nama = "LIONEL MESSI", asal = "ARGENTINA"))
        listpemainbola.add(ItemDataActivity(R.drawable.neymarjr, nama = "NEYMAR JUNIOR", asal = "BRAZIL"))
        listpemainbola.add(ItemDataActivity(R.drawable.mbappe, nama = "KYLIAN MBAPPE", asal = "FRANCE"))
        listpemainbola.add(ItemDataActivity(R.drawable.vinijr, nama = "VINICIUS JUNIOR", asal = "BRAZIL"))
        listpemainbola.add(ItemDataActivity(R.drawable.rodrygo, nama = "RODRYGO", asal = "BRAZIL"))
        listpemainbola.add(ItemDataActivity(R.drawable.jude, nama = "JUDE BELLINGHAM", asal = "ENGLAND"))
        listpemainbola.add(ItemDataActivity(R.drawable.modric, nama = "LUKA MODRIC", asal = "CROATIA"))
        listpemainbola.add(ItemDataActivity(R.drawable.sramos, nama = "SERGIO RAMOS", asal = "SPAIN"))

        pemainbolaRecyclerView.layoutManager = LinearLayoutManager(this)
        pemainbolaRecyclerView.setHasFixedSize(true)
        pemainbolaAdapter = MyAdapterActivity(listpemainbola)
        pemainbolaRecyclerView.adapter = pemainbolaAdapter

    }
}
