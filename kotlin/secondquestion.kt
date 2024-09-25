package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class secondquestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondquestion)
        val buttony = findViewById<Button>(R.id.firstyes)
        buttony.setOnClickListener {
            val intent = Intent(this@secondquestion, detailedquestion2::class.java)
            startActivity(intent)
        }
        val buttonn = findViewById<Button>(R.id.firstno)
        buttonn.setOnClickListener {
            val intent = Intent(this@secondquestion, thirdquestion::class.java)
            startActivity(intent)
        }
    }
}