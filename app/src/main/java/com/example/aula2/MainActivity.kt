package com.example.aula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onpause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "ondestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onstop")
    }

    //Adicionei o metodo A
}