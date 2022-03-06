package com.example.applicationcurriculumvitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.applicationcurriculumvitae.Education.EducationFragment
import com.example.applicationcurriculumvitae.Experience.ExperienceFragment

class CareerActivity : AppCompatActivity() {
    lateinit var buttonexperience: Button;
    lateinit var buttoneducation: Button;

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career)
        buttonexperience = findViewById(R.id.bexperience)
        buttoneducation = findViewById(R.id.beducation)
        buttonexperience.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView2, ExperienceFragment()).addToBackStack("")
                .commit()
        }

        buttoneducation.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView2, EducationFragment()).addToBackStack("")
                .commit()
        }

    }


}