package com.example.stalker.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.stalker.R
import com.example.stalker.ui.register.RegisterActicity

class LoginActivity : AppCompatActivity() {

    private var mNotAccounttextviewLabel: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initUiElements()
    }

    fun initUiElements(){
        mNotAccounttextviewLabel = findViewById<View>(R.id.notAccounttextview) as TextView
        mNotAccounttextviewLabel!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Intent(baseContext, RegisterActicity::class.java).also {
                    startActivity(it)
                }
            }
        })
    }
}
