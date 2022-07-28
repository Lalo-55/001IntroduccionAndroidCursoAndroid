package com.luismorales17106494.a008activitiesylifecycles

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


        boton.setOnClickListener{
            texto.text = "Curso Android"

        }
        Log.d("Lifecycles", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycles", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycles", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycles", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycles", "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycles", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycles", "OnDestroy")
    }
}