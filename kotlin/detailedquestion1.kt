package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class detailedquestion1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailedquestion1)
        val buttonn = findViewById<Button>(R.id.firstyes)
        buttonn.setOnClickListener {
            val intent = Intent(this@detailedquestion1, detailedquestion1_1::class.java)
            startActivity(intent)
        }
        val buttony = findViewById<Button>(R.id.firstno)
        buttony.setOnClickListener {
            val intent = Intent(this@detailedquestion1, detailedquestion1_2::class.java)
            startActivity(intent)
        }
    }
}