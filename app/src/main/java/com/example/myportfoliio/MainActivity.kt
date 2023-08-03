package com.example.myportfoliio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val skillbutton = findViewById<Button>(R.id.button1)
        val edubutton=findViewById<Button>(R.id.button2)
        val workbutton= findViewById<Button>(R.id.button3)
        val achievementbutton= findViewById<Button>(R.id.button4)


//Here the code for performing activity when click on button

        skillbutton.setOnClickListener{

            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)

        }

        edubutton.setOnClickListener{
            intent=Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

       workbutton.setOnClickListener {
           intent= Intent(this,WorkActivity::class.java)
           startActivity(intent)
       }
        achievementbutton.setOnClickListener {
            intent=Intent(this,AchievementActivity::class.java)
            startActivity(intent)
        }





    }
}