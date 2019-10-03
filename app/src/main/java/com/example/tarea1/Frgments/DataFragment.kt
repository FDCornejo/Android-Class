package com.example.tarea1.Frgments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.tarea1.R
import com.example.tarea1.Services.DataSource
import com.example.tarea1.Services.MailRecyclerAdapter
import com.example.tarea1.models.MailPost
import kotlinx.android.synthetic.main.fragment_data.*

/**
 * A simple [Fragment] subclass.
 */
class DataFragment : Fragment() {
    private lateinit var mailAdapter:MailRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment addDataSet()
        val miVista =  inflater.inflate(R.layout.fragment_data, container, false)
        val recyclerView: RecyclerView =miVista.findViewById(R.id.recycler_view)
        recyclerView.layoutManager=LinearLayoutManager(null,LinearLayoutManager.VERTICAL,false)
       val data =DataSource.createDataSet()

        //val items =ArrayList<MailPost>()
        //items.add(MailPost("Congratulations", "Daniel@gmial.com","Que pedo"))
        val adapter=MailRecyclerAdapter(data)
        recyclerView.adapter=adapter




        //val data=DataSource.createDataSet()
        //mailAdapter.submitList(data)
        //mailAdapter=MailRecyclerAdapter()
        //recyclerView.adapter=mailAdapter
        return miVista
    }


    /*private fun initRecyclerView(){
        recycler_view.apply {
            recycler_view.layoutManager= LinearLayoutManager(null,LinearLayoutManager.VERTICAL,false)
            mailAdapter= MailRecyclerAdapter()
            adapter=mailAdapter

        }*/

    }

    /*private fun addDataSet(){
        val data = DataSource.createDataSet()
        mailAdapter.submitList(data)
    }



}*/
