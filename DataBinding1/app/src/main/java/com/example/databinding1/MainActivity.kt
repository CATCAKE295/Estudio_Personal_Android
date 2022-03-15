package com.example.databinding1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dbinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dbinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        dbinding.txtTexto.text = "El texto ha sido cambiado desde el mainActivity usando Data Binding"
    }
}