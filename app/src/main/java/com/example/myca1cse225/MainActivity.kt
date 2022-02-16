package com.example.myca1cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myToolbar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.myToolbar)
        setSupportActionBar(myToolbar)

        myToolbar.setNavigationOnClickListener{
            Toast.makeText(this,"Navigatiion memu Selected",Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemview=item.itemId
        val i1:Intent
        val i2:Intent
        when(itemview){
            R.id.search  -> Toast.makeText(this,"Search Clicked",Toast.LENGTH_LONG).show()
            R.id.notify  -> Toast.makeText(this,"Notifications Clicked",Toast.LENGTH_LONG).show()
            R.id.rate   -> {i1=Intent(this, Rating::class.java)
            startActivity(i1)}
            R.id.gallery ->{
                i2= Intent(this,Gallery::class.java)
                startActivity(i2)
            }

        }

        return false
    }

}


