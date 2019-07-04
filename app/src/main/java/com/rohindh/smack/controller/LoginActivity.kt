package com.rohindh.smack.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rohindh.smack.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun loginLoginBtnClicked(view: View){

    }
    fun loginCreateAccBtnClicked(view: View){
        val createUserIntent = Intent(this , CreateUserActivity::class.java)
        startActivity(createUserIntent)
    }

}
