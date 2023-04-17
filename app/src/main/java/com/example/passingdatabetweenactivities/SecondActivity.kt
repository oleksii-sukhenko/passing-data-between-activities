package com.example.passingdatabetweenactivities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passingdatabetweenactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        tvPerson()

    }


    @SuppressLint("SetTextI18n")
    private fun tvPerson() = with(binding) {

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person


        tvPerson.text = "${person.name} is ${person.age} years old and lives in ${person.country}"
    }
}