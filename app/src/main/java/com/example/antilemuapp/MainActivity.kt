package com.example.antilemuapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var usu : EditText = findViewById(R.id.txt_usuario)
        var pass : EditText = findViewById(R.id.txt_pass)
        var ingresar : Button = findViewById(R.id.btn_ingresar)

        ingresar.setOnClickListener{
            val usuario = usu.text.toString()
            val contraseña = pass.text.toString()

            if (usuario.isEmpty()) {
                Toast.makeText(this, "Debe ingresar un Usuario", Toast.LENGTH_LONG).show()
                }
            else if(contraseña.isEmpty()) {
                Toast.makeText(this, "Debe ingresar un Contraseña", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Ingreso Correctamente", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Admin::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}