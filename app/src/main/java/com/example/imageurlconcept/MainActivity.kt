package com.example.imageurlconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.imageurlconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        val imageurl: ImageView = binder.imageView
        Log.d("1","Hello")
        val url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAOZsOIBTyNND54nzK7qntwTYvOXjSz-m4yg&usqp=CAU"
        Log.d("2","world")
        Glide.with(this).load(url).into(imageurl)
        Log.d("3","NowNow")
    }
}











