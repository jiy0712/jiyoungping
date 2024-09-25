package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class fourthquestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fourthquestion)
        val buttonn = findViewById<Button>(R.id.firstyes)
        buttonn.setOnClickListener {
            val intent = Intent(this@fourthquestion, heartsping::class.java)
            startActivity(intent)
        }
        val buttony = findViewById<Button>(R.id.firstno)
        buttony.setOnClickListener {
            val intent = Intent(this@fourthquestion, fifthquestion::class.java)
            startActivity(intent)
        }
    }
}