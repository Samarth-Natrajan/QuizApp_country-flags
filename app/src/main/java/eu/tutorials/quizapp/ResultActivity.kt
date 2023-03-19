package eu.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView

// TODO (STEP 3: Create a result activity for showing the score.)
// START
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val name = intent.getStringExtra(Constants.User_NAME)
        val nametext = findViewById<TextView>(R.id.tv_name)
        nametext.text = name

        val c = intent.getStringExtra(Constants.correct)
        val t = intent.getIntExtra(Constants.total,0)

        val button = findViewById<Button>(R.id.btn_finish)
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }



    }
}