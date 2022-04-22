package com.joaovrb.devprofilelayout

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.joaovrb.devprofilelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //define binding for the expected layout, than, every ID will be pushed
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This creates an instance of the binding class for the activity to use.
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Get a reference to the root view by either calling the getRoot() method or using Kotlin property syntax.
        val view = binding.root

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        // rounded.isCircular = true
        rounded.cornerRadius = 30f
        binding.logo.setImageDrawable(rounded)

        // Update View
        setContentView(view)
    }
}