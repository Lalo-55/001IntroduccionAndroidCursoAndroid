package com.luismorales17106494.a008activitiesylifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val botonVolver = findViewById<Button>(R.id.btnVolver)

        botonVolver.setOnClickListener {
            finish()
        }

    }
}