package com.example.tarea1.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.example.tarea1.R
import kotlinx.android.synthetic.main.activity_email.*

class EmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val theIntent = intent
        val mail = theIntent.getStringExtra("correo")
        val subject = theIntent.getStringExtra("asunto")
        val body = theIntent.getStringExtra("texto")

        textView2.setText(mail)
        textView3.setText(subject)
        textView4.setText(body)

    }
}
