package com.example.pm25week3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // tes listener
        val teks = findViewById<TextView>(R.id.teks)
        val tombol = findViewById<Button>(R.id.tombol)

        tombol.setOnClickListener {
            teks.text = "Hidup Djokowii!!"
        }
        // pindah halaman
        findViewById<Button>(R.id.tombolPindah).setOnClickListener {
            startActivity(Intent(this, SecondaryActivity::class.java))
        }
    }
}
