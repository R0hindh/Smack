package com.rohindh.smack.controller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rohindh.smack.R
import kotlinx.android.synthetic.main.activity_create_user.*
import kotlin.random.Random

class CreateUserActivity : AppCompatActivity() {
    var userAvatar = "profiledefault"
    var avatarBackgroundColor = "[0.5,0.5,0.5,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

    }
    fun GenerateUserAvatarImageClick(view: View){
        val avatar = Random.nextInt(28)
        val color = Random.nextInt(2)
        if (color == 0){
            userAvatar = "light$avatar"
        }else{
            userAvatar = "dark$avatar"
        }
        val resourceId = resources.getIdentifier(userAvatar,"drawable",packageName)
        createAvatarImageView.setImageResource(resourceId)
    }
    fun backgroundColorBtnClicked(view: View){
        val r = Random.nextInt(255)
        val b = Random.nextInt(255)
        val g = Random.nextInt(255)
        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble()/255
        val savedG = g.toDouble()/255
        val savedB = b.toDouble()/255

        avatarBackgroundColor = "[$savedR,$savedG,$savedB]"

    }
    fun createUserBtnClicked(view: View){
        AthuServices.registerUser(this,"test@gmail.com","12345678"){complete ->
            if (complete){

            }
        }
    }

}
