package com.example.tarea1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val theIntent = intent
        val mail = theIntent.getStringExtra("name")
        val pass = theIntent.getStringExtra("pass")

        textResult.text="Welcome: ${mail} Your password is ${pass}"




    }
}
