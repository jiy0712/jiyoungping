package com.example.jiyping
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class sleeping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sleeping)
        val buttonn = findViewById<Button>(R.id.firstno)
        buttonn.setOnClickListener {
            val intent = Intent(this@sleeping, MainActivity::class.java)
            startActivity(intent)
        }
    }
}