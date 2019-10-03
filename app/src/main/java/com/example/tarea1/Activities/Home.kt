package com.example.tarea1.Activities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tarea1.R
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tarea1.Frgments.BetailsFragment
import com.example.tarea1.Frgments.DataFragment
import com.example.tarea1.Services.DataSource
import com.example.tarea1.Services.MailRecyclerAdapter
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_data.*

class Home : AppCompatActivity() {
    private var btnFrag1: Button? = null
    private var btnFrag2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        addFragment(DataFragment(), false, "two")
        btnFrag1 = findViewById(R.id.btnFr1) as Button
        btnFrag2 = findViewById(R.id.btnFr2) as Button

        btnFrag2!!.setOnClickListener { addFragment(BetailsFragment(), false, "one") }

        btnFrag1!!.setOnClickListener { addFragment(DataFragment(), false, "two") }

        val theIntent = intent
        //val mail = theIntent.getStringExtra("name")
        //val pass = theIntent.getStringExtra("pass")

        //textResult.text="Welcome: ${mail} Your password is ${pass}"
    }




    fun addFragment(fragment: Fragment, addToBackStack: Boolean, tag: String) {
        val manager = supportFragmentManager
        val ft = manager.beginTransaction()

        if (addToBackStack) {
            ft.addToBackStack(tag)
        }
        ft.replace(R.id.container_frame, fragment, tag)
        ft.commitAllowingStateLoss()
    }
}
