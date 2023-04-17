package com.example.passingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passingdatabetweenactivities.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        btnApply()
    }

    private fun btnApply() = with(binding) {
        btnApply.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            val person = Person(name, age, country)
            Intent(this@MainActivity, SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}