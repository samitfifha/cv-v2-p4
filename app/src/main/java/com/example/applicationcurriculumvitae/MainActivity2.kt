package com.example.applicationcurriculumvitae

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

import android.widget.Button
import com.example.applicationcurriculumvitae.Experience.ExperienceFragment
import com.example.applicationcurriculumvitae.Profile.HelpFragment
import com.example.applicationcurriculumvitae.Profile.HobbiesFragment
import com.example.applicationcurriculumvitae.Profile.LanguageFragment
import com.example.applicationcurriculumvitae.Profile.SkillsFragment

class MainActivity2 : AppCompatActivity() {


    lateinit var buttonskills: Button;
    lateinit var buttonhobbies: Button;
    lateinit var buttonlanguage: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

            buttonskills = findViewById(R.id.skills)
            buttonhobbies = findViewById(R.id.hobbies)
            buttonlanguage = findViewById(R.id.language)

            buttonskills.setOnClickListener {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, SkillsFragment()).addToBackStack("")
                    .commit()
            }


            buttonhobbies.setOnClickListener {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, HobbiesFragment()).addToBackStack("")
                    .commit()
            }


            buttonlanguage.setOnClickListener {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, LanguageFragment()).addToBackStack("")
                    .commit()
            }
        val button = findViewById<Button>(R.id.submit2)

        button.setOnClickListener {
            val bundle=Bundle()

            intent= Intent(this,CareerActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }
        /* val button= findViewById<Button>(R.id.submit)
         button.setOnClickListener {


             val user = intent.extras?.getSerializable("user")
             intent= Intent(this,MainActivity3::class.java)
             val bundle=Bundle()
             bundle.putSerializable("user",user)
             intent.putExtras(bundle)
             startActivity(intent)

        }*/

        val imageView2 = findViewById(R.id.imageView6) as ImageView
        imageView2.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, HelpFragment()).addToBackStack("")
                .commit()
        }
        }
    }






