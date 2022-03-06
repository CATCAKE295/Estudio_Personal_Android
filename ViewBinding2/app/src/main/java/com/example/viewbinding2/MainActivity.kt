package com.example.viewbinding2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbinding2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val list = listOf("Vacio","Indiferencia","Tristeza","Pereza","Fracaso","Soledad")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRecyclerView.setOnClickListener { mostrarRV() }
        binding.btnFragment.setOnClickListener { mostrarFragment() }


    }

    private fun mostrarRV(){
        binding.fragmentContainer.visibility = View.GONE
        binding.RV.visibility = View.VISIBLE

        binding.RV.setHasFixedSize(true)
        binding.RV.layoutManager = LinearLayoutManager(this)
        val adapter = Recycler_Adapter(list)
        binding.RV.adapter = adapter

    }

    private fun mostrarFragment(){
        binding.fragmentContainer.visibility = View.VISIBLE
        binding.RV.visibility = View.GONE

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, BlankFragment())
        fragmentTransaction.commit()
    }
}