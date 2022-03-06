package com.example.applicationcurriculumvitae
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.example.applicationcurriculumvitae.data.User

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    private val pickImage = 100
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView2 = findViewById(R.id.imageView2) as ImageView
        imageView2.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }





        val button = findViewById<Button>(R.id.button1920)
        button.setOnClickListener {
            val user= User()
            user.fullName= findViewById<TextInputLayout>(R.id.fullname).editText?.text.toString()
            user.email= findViewById<TextInputLayout>(R.id.email).editText?.text.toString()
            user.age= findViewById<TextInputLayout>(R.id.age).editText?.text.toString().toInt()
            val bundle=Bundle()
            bundle.putSerializable("user",user)

            intent= Intent(this,MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)
        }
    }




    }
