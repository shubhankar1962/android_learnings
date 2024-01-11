package com.example.fragmentcommunication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragmentcommunication.CommunicatorInterface
import com.example.fragmentcommunication.R


class FragmentA : Fragment() {

    private lateinit var communicator: CommunicatorInterface


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val sendBtn = view.findViewById<Button>(R.id.sendBtn)
        val editText = view.findViewById<EditText>(R.id.editTextforGetData)

        sendBtn.setOnClickListener{
            val getData = editText.text.toString()

            val bundle = Bundle()
            bundle.putString("message", getData)      // put data to bundle with key value

            val recievedFragmentB = FragmentB()
            recievedFragmentB.arguments = bundle                 //getting data through bundle ton fragment b


            val transaction = requireActivity().supportFragmentManager.beginTransaction()           // now replacing the fragment a with fragment b and for showing data code is in fragment b
            transaction.replace(R.id.container,recievedFragmentB)
            transaction.addToBackStack(null)            //this help when user click on back button so it will come to its previous state
            transaction.commit()
        }
        //communicator = activity as CommunicatorInterface
        
        return view
    }


}