package com.example.meson



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonbanner= findViewById<Button>(R.id.banner)
        val buttoninstream= findViewById<Button>(R.id.instream)
        val buttoninterstitial= findViewById<Button>(R.id.interstitial)
        val buttonnative= findViewById<Button>(R.id.nativ)
        val layout= findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.constraint)

        buttonbanner.setOnClickListener {
            Toast.makeText(applicationContext, "Showing Ad..", Toast.LENGTH_SHORT).show()
            //startActivity()
        }
        buttoninstream.setOnClickListener {
            Toast.makeText(applicationContext, "Showing Ad..", Toast.LENGTH_SHORT).show()
        }
        buttoninterstitial.setOnClickListener {
            Toast.makeText(applicationContext, "Showing Ad..", Toast.LENGTH_SHORT).show()
        }
        buttonnative.setOnClickListener {
            Toast.makeText(applicationContext, "Showing Ad..", Toast.LENGTH_SHORT).show()
        }


    }
}