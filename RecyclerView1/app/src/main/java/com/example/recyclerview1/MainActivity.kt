package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview1.adapter.ItemAdapter
import com.example.recyclerview1.data.Datasource
import com.example.recyclerview1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().CargarInformacion()

        binding.apply {
            val recyclerView = recyclerview
            recyclerView.adapter = ItemAdapter(this@MainActivity,myDataset)
            recyclerView.setHasFixedSize(true)
        }
    }
}