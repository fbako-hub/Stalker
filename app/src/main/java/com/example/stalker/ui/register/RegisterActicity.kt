package com.example.stalker.ui.register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.example.stalker.R
import com.example.stalker.ui.informations.InformationsActivity

class RegisterActicity : AppCompatActivity {

    // Declaration de mon bouton

    lateinit var cirRegisterButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //initialisation
        cirRegisterButton = findViewById(R.id.cirRegisterButton)

        //creation de notre intent
        val monIntent : Intent = Intent(this,InformationsActivity::class.java)

        //clic sur le bouton
        cirRegisterButton.setOnClickListener {

            startActivity(monIntent)
        }
    }
}