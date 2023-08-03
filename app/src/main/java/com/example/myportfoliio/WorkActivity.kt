package com.example.myportfoliio


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class WorkActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)


        var cardView1: CardView
        var cardView2: CardView
        var cardView3: CardView
        var cardView4: CardView


        cardView1 = findViewById<CardView>(R.id.firstCard)
        cardView2 = findViewById<CardView>(R.id.secondCard)
        cardView3 = findViewById<CardView>(R.id.thirdCard)
        cardView4 = findViewById<CardView>(R.id.forthCard)

        cardView1.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AkhilllYadav/Codsoft_Task-1"))
            startActivity(browserIntent)
        }

        cardView2.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://akhilllyadav.github.io/CarBooking-front-end/"))
            startActivity(browserIntent)
        }

        cardView3.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://akhilllyadav.github.io/Drum-kit/"))
            startActivity(browserIntent)
        }
        cardView4.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://akhilllyadav.github.io/Drum-kit/"))
            startActivity(browserIntent)
        }


    }
}