package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview2.adapter.SuperAdapter
import com.example.recyclerview2.data.DataSource
import com.example.recyclerview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource().CargarInfo()

        binding.apply {
            val recycler = recyclerSuper
            recycler.layoutManager = LinearLayoutManager(this@MainActivity)
            recycler.adapter = SuperAdapter(this@MainActivity,myDataset)
            recycler.setHasFixedSize(true)
        }
    }
}