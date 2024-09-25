package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class detailedquestion1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailedquestion1_2)
        val buttony = findViewById<Button>(R.id.firstyes)
        buttony.setOnClickListener {
            val intent = Intent(this@detailedquestion1_2, shushping::class.java)
            startActivity(intent)
        }
        val buttonn = findViewById<Button>(R.id.firstno)
        buttonn.setOnClickListener {
            val intent = Intent(this@detailedquestion1_2, nonoping::class.java)
            startActivity(intent)
        }
    }
}