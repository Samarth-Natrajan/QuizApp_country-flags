package eu.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val name = intent.getStringExtra(Constants.User_NAME)
        val scoretxt = findViewById<TextView>(R.id.tv_score)
        val nametext = findViewById<TextView>(R.id.tv_name)
        nametext.text = name

        val c = intent.getIntExtra(Constants.CORRECT,0)
        val t = intent.getIntExtra(Constants.TOTAL,0)
        scoretxt.text = "You have got ${c} questions correct out of ${t} questions"
        val button = findViewById<Button>(R.id.btn_finish)
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }



    }
}