package com.harsh.myapplication

import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var ivTennis : ImageView = findViewById(R.id.ivTennis)
        var move : Animation = android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.move)
        ivTennis.startAnimation(move)
    }
}