package com.example.tarea1.Frgments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.tarea1.R

/**
 * A simple [Fragment] subclass.
 */
class BetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val miVista = inflater.inflate(R.layout.fragment_betails, container, false)
        return miVista
    }


}
