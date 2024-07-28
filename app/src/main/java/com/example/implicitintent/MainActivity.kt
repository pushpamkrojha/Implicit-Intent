package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gitbtn = findViewById<CardView>(R.id.cardGithub)
        val linkedbtn = findViewById<CardView>(R.id.cardLinkedIn)
        val umsbtn = findViewById<CardView>(R.id.cardUms)
        val cameraBtn = findViewById<CardView>(R.id.cardCamera)

        gitbtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/pushpamkrojha")
            startActivity(intent)
        }

        linkedbtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/pushpamkumar540")
            startActivity(intent)

        }

        umsbtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://ums.lpu.in/lpuums/LoginNew.aspx")
            startActivity(intent)
        }

        cameraBtn.setOnClickListener{
             val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}