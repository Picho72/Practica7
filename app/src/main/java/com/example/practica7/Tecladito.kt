package com.example.practica7

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tecladito : AppCompatActivity() {
    lateinit var txtNumeritos: TextView
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btnC:Button
    lateinit var btnD:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tecladito)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtNumeritos = findViewById(R.id.txtNumeritos)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btnC = findViewById(R.id.btnC)
        btnD = findViewById(R.id.btnD)

        btn1.setOnClickListener(){
            txtNumeritos.append("1")
        }
        btn2.setOnClickListener(){
            txtNumeritos.append("2")
        }
        btn3.setOnClickListener(){
            txtNumeritos.append("3")
        }
        btn4.setOnClickListener(){
            txtNumeritos.append("4")
        }
        btnC.setOnClickListener(){
            txtNumeritos.text = ""
        }
        btnD.setOnClickListener(){
            val textoActual = txtNumeritos.text.toString()
            if (textoActual.isNotEmpty()) {
                txtNumeritos.text = textoActual.substring(0, textoActual.length - 1)
            }
        }

    }
}