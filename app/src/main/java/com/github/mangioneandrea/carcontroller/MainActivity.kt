package com.github.mangioneandrea.carcontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.github.controlwear.virtual.joystick.android.JoystickView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val x = findViewById<View>(R.id.xAxis) as JoystickView

        x.setOnMoveListener { _, _ ->
            println("X: ${x.normalizedX}")
        }
        val y = findViewById<View>(R.id.yAxis) as JoystickView
        y.setOnMoveListener { _, _ ->
            println("y: ${y.normalizedY}")
        }
    }
}