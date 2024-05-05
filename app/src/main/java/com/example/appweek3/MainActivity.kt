// Imperative Approach:-> Industrial Relative
// Use from scratch all the views in XML
// and Connect with JAVA/KOTLIN

package com.example.appweek3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appweek3.databinding.ActivityMainBinding


// ex:-    Clas Intern: Employee (Inheritance)
// copying all the logic of parent class to child class
class MainActivity : AppCompatActivity() {

    // Converting the xml file to java to make it more simple
    // Called -> VIEW BINDING
    private lateinit var binding : ActivityMainBinding


    // Fun 1 -> with parameter but not return type
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // We are changing the title in the XML file from MAIN file
        binding.textTitle.text = "App Of Tomorrow"


    }
}


