package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class fifthquestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fifthquestion)
        val buttonn = findViewById<Button>(R.id.firstyes)
        buttonn.setOnClickListener {
            val intent = Intent(this@fifthquestion, dadaping::class.java)
            startActivity(intent)
        }
        val buttony = findViewById<Button>(R.id.firstno)
        buttony.setOnClickListener {
            val intent = Intent(this@fifthquestion, sixthquestion::class.java)
            startActivity(intent)
        }
    }
}