package com.example.fragmentcommunication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.fragmentcommunication.Fragments.FragmentA
import com.example.fragmentcommunication.Fragments.FragmentB

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //-----------------communication b/w activities------------
//        val sendBtnActivity = findViewById<Button>(R.id.sendBtnActivity)
//
//        sendBtnActivity.setOnClickListener {
//            callActivity()
//        }
        //----------------------------

        //--------------------------commuinication b/w fragments-------------------

        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragmentA)
        }

        if (savedInstanceState == null) {
            val fragmentA = FragmentA()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, fragmentA)
                commit()
            }
        }
        //---------------------------------------------

    }


    // ---------------------------comm activity

//    private fun callActivity() {
//        val editext= findViewById<EditText>(R.id.sendDataActivity)
//        val message = editext.text.toString()
//
//        val intent = Intent(this, RecieverActivity::class.java).also {
//            it.putExtra("EXTRA_MESSAGE",message)
//            startActivity(it)
//        }
//
//    }


}
