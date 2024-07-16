package com.example.jokingapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

   private lateinit var viewModel: JokesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(JokesViewModel::class.java)

        viewModel._jokesData.observe(this){data ->
            Log.d("TAG","Jokes: $data")
        }

    }
}