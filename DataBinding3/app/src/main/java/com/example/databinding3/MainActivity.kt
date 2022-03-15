package com.example.databinding3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dbinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dbinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        dbinding.btnBoton.setOnClickListener {
            displayName()
        }
    }

    private fun displayName() {
        dbinding.txtTexto.text=dbinding.etxtNombre.text

    }
}