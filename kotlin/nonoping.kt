package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class nonoping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nonoping)
        val buttonn = findViewById<Button>(R.id.firstno)
        buttonn.setOnClickListener {
            val intent = Intent(this@nonoping, MainActivity::class.java)
            startActivity(intent)
        }
    }
}