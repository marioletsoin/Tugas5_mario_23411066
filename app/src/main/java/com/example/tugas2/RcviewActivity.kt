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
        binding = ActivityRcviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol back untuk kembali ke PilihanActivity
        binding.iVbackrcview.setOnClickListener {
            val intentHome = Intent(this, PilihanActivity::class.java)
            startActivity(intentHome)
        }

        pemainbolaRecyclerView = findViewById(R.id.PemainbolaRV)
        listpemainbola = ArrayList()

        // Tambahkan data daftar pemain beserta deskripsi untuk masing-masing
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.cr7,
                "CRISTIANO RONALDO",
                "PORTUGAL",
                "Cristiano Ronaldo adalah salah satu pemain sepak bola terbaik dengan kemampuan luar biasa dalam mencetak gol."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.lmessi,
                "LIONEL MESSI",
                "ARGENTINA",
                "Lionel Messi dikenal dengan dribbling mempesona dan kreativitas dalam mengatur permainan."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.neymarjr,
                "NEYMAR JUNIOR",
                "BRAZIL",
                "Neymar Junior memiliki keterampilan teknis tinggi yang membuatnya menonjol di lapangan."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.mbappe,
                "KYLIAN MBAPPE",
                "FRANCE",
                "Kylian Mbappe dikenal dengan kecepatan dan ketajamannya dalam mencetak gol sebagai penyerang muda."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.vinijr,
                "VINICIUS JUNIOR",
                "BRAZIL",
                "Vinicius Junior menonjol dengan akselerasi dan kemampuan dribbling yang luar biasa."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.rodrygo,
                "RODRYGO",
                "BRAZIL",
                "Rodrygo menunjukkan potensi besar sebagai pemain serba bisa di lini serang."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.jude,
                "JUDE BELLINGHAM",
                "ENGLAND",
                "Jude Bellingham menjadi pilihan andalan berkat visi dan kekuatan fisiknya di tengah lapangan."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.modric,
                "LUKA MODRIC",
                "CROATIA",
                "Luka Modric dikenal dengan pengendalian bola dan kemampuan mengatur ritme permainan yang brilian."
            )
        )
        listpemainbola.add(
            ItemDataActivity(
                R.drawable.sramos,
                "SERGIO RAMOS",
                "SPAIN",
                "Sergio Ramos merupakan pemain bertahan berpengalaman yang juga mampu mencetak gol penting."
            )
        )

        pemainbolaRecyclerView.layoutManager = LinearLayoutManager(this)
        pemainbolaRecyclerView.setHasFixedSize(true)
        pemainbolaAdapter = MyAdapterActivity(listpemainbola)
        pemainbolaRecyclerView.adapter = pemainbolaAdapter

        // Tangani klik pada item untuk membuka DetailActivity dengan mengirim data lengkap
        pemainbolaAdapter.onItemClick = { item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("itemDetail", item)
            startActivity(intent)
        }
    }
}
