package au.edu.swin.sdmd.thecontest

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var value = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val userNumber = value
        outState.putInt("savedInt", value)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val currentScore = findViewById<TextView>(R.id.currentScore)
        val userInt = savedInstanceState.getInt("savedInt", 0)
        value = userInt
        currentScore.text = value.toString()
    }
}