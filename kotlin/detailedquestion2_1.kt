package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class detailedquestion2_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailedquestion2)
        val buttony = findViewById<Button>(R.id.firstyes)
        buttony.setOnClickListener {
            val intent = Intent(this@detailedquestion2_1, giggleping::class.java)
            startActivity(intent)
        }
        val buttonn = findViewById<Button>(R.id.firstno)
        buttonn.setOnClickListener {
            val intent = Intent(this@detailedquestion2_1, dreamping::class.java)
            startActivity(intent)
        }
    }
}