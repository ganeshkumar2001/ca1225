package com.example.myca1cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class Rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
        val rating1=findViewById<RatingBar>(R.id.rate1)
        val rating2=findViewById<RatingBar>(R.id.rate2)
        val rating3=findViewById<RatingBar>(R.id.rate3)
        val rating4=findViewById<RatingBar>(R.id.rate4)
        val submit1=findViewById<Button>(R.id.submit)
        val text=findViewById<TextView>(R.id.text)

        submit1.setOnClickListener {
            val rate_num1=rating1.rating
            val rate_num2=rating2.rating
            val rate_num3=rating3.rating

            val avg:Float = (rate_num1+rate_num2+rate_num3)/3
            rating4.rating=avg

        }
    }
}