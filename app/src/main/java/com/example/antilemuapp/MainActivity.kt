package com.example.antilemuapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var usuario : EditText = findViewById(R.id.txt_usuario)
        var pass : EditText = findViewById(R.id.txt_pass)
        var ingresar : Button = findViewById(R.id.btn_ingresar)


    }
}