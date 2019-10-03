package com.example.tarea1.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.tarea1.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.boton1.setOnClickListener(){

            val intent= Intent(this, Home::class.java).apply {
                //putExtra("name", texto1.text.toString())
                //putExtra("pass", texto2.text.toString())
            }
            startActivity(intent)
        }
    }
}
