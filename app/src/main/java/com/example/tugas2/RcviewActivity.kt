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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2.databinding.ActivityMenuBinding
import com.example.tugas2.databinding.ActivityRcviewBinding
import com.example.tugas2.ui.theme.TUGAS2Theme

class RcviewActivity : ComponentActivity() {
    private lateinit var binding: ActivityRcviewBinding
    private lateinit var pemainbolaRecyclerView: RecyclerView
    private lateinit var pemainbolaAdapter: MyAdapter
    private lateinit var listpemainbola: ArrayList<ItemData>

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

        listpemainbola.add(ItemData(R.drawable.cr7, nama = "CRISTIANO RONALDO", asal = "PORTUGAL"))
        listpemainbola.add(ItemData(R.drawable.lmessi, nama = "LIONEL MESSI", asal = "ARGENTINA"))
        listpemainbola.add(ItemData(R.drawable.neymarjr, nama = "NEYMAR JUNIOR", asal = "BRAZIL"))
        listpemainbola.add(ItemData(R.drawable.mbappe, nama = "KYLIAN MBAPPE", asal = "FRANCE"))
        listpemainbola.add(ItemData(R.drawable.vinijr, nama = "VINICIUS JUNIOR", asal = "BRAZIL"))
        listpemainbola.add(ItemData(R.drawable.rodrygo, nama = "RODRYGO", asal = "BRAZIL"))
        listpemainbola.add(ItemData(R.drawable.jude, nama = "JUDE BELLINGHAM", asal = "ENGLAND"))
        listpemainbola.add(ItemData(R.drawable.modric, nama = "LUKA MODRIC", asal = "CROATIA"))
        listpemainbola.add(ItemData(R.drawable.sramos, nama = "SERGIO RAMOS", asal = "SPAIN"))

        pemainbolaRecyclerView.layoutManager = LinearLayoutManager(this)
        pemainbolaRecyclerView.setHasFixedSize(true)
        pemainbolaAdapter = MyAdapter(listpemainbola)
        pemainbolaRecyclerView.adapter = pemainbolaAdapter

    }
}
