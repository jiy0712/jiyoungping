package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class firstfinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstfinal)
        val buttony = findViewById<Button>(R.id.firstyes)
        buttony.setOnClickListener {
            val intent = Intent(this@firstfinal, moseyping::class.java)
            startActivity(intent)
        }
    }
}