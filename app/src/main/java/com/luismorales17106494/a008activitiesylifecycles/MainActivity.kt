package com.luismorales17106494.a008activitiesylifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

/*
Clase Introduccion a Android 008 Activities y lifecycles
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textView)
        val boton = findViewById<Button>(R.id.btnAccion)


        boton.setOnClickListener {
            texto.text = "Curso Android"
            navegarSegundaActivity()

        }

    }

    private fun navegarSegundaActivity() {

        val intent = Intent(this, SegundaActivity::class.java)
        startActivity(intent)
    }
}