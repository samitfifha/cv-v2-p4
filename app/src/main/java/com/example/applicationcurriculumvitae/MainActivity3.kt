package com.example.applicationcurriculumvitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.applicationcurriculumvitae.data.User

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val user: User = intent.extras?.getSerializable("user") as User
        val state = "Full Name = ${user.fullName} \n Email = ${user.email} \n Age = ${user.age}  "
        findViewById<TextView>(R.id.state).text = state
    }
}