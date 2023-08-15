package au.edu.swin.sdmd.thecontest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = 0
        val score = findViewById<Button>(R.id.score)
        val reset = findViewById<Button>(R.id.reset)
        val steal = findViewById<Button>(R.id.steal)
        val currentScore = findViewById<TextView>(R.id.currentScore)

        score.setOnClickListener{
            value++
            currentScore.text = value.toString()
        }

        reset.setOnClickListener{
            value = 0
            currentScore.text = value.toString()
        }

        steal.setOnClickListener{
            value--
            currentScore.text = value.toString()
        }



    }

}