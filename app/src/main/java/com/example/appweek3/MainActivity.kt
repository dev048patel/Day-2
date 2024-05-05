// Imperative Approach:-> Industrial Relative
// Use from scratch all the views in XML
// and Connect with JAVA/KOTLIN

package com.example.appweek3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.appweek3.databinding.ActivityMainBinding


// ex:-    Clas Intern: Employee (Inheritance)
// copying all the logic of parent class to child class
class MainActivity : AppCompatActivity() {

    // Converting the xml file to java to make it more simple
    // Called -> VIEW BINDING
    private lateinit var binding: ActivityMainBinding


    // Fun -> with parameter but not return type
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // We are changing the title in the XML file from MAIN file
        //  binding.textTitle.text = "App Of Tomorrow"


        // Button listener:-When a user taps or clicks on a button, the listener detects this event and triggers a specific action or set of actions defined in the listener's callback function.

        // changing the text by clicking button
        binding.buttonSetImage.setOnClickListener {
            binding.textTitle.text = "App Of Tomorrow"
        }


        // changing image and text based on the click

        binding.buttonSetImage.setOnClickListener {
            binding.textTitle.text = "Set Image Successful"
            // change of image

            // 1st way
            binding.DownloadedImage.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.wallpaper2
                )
            )

            // from official glide (Github)
            Glide
                .with(this)
                .load("https://image.tmdb.org/t/p/original/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg")
                //.centerCrop()
                //.placeholder(R.drawable.loading_spinner)
                .into(binding.DownloadedImage);
            // 2nd way
//            val drawable = ContextCompat.getDrawable(this,R.drawable.wallpaper2)
//            binding.DownloadedImage.setImageDrawable(drawable)
        }
    }
}


