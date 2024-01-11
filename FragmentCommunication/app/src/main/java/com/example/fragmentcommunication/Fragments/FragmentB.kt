package com.example.fragmentcommunication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentcommunication.R

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.fragment_b, container, false)
        val recievedText = view.findViewById<TextView>(R.id.dataRecievedTextView)

        //getting data by using key

        val recievedData = arguments?.getString("message")
       // recievedText.text = "recieved Data is:$recievedData"
        recievedText.setText(recievedData)
        return view
    }


}