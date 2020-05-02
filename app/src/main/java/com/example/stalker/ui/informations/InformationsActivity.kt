package com.example.stalker.ui.informations

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.stalker.R

class InformationsActivity : AppCompatActivity {

    // Declaration de mon bouton

    lateinit var cirSaveButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //initialisation
        cirSaveButton = findViewById(R.id.cirSaveButton)

        //creation de notre intent
        val myIntent : Intent = Intent(this,InformationsActivity::class.java)

        //clic sur le bouton
        cirSaveButton.setOnClickListener {

            startActivity(myIntent)
        }
}