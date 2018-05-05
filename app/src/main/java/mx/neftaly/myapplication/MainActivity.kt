package mx.neftaly.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView
import mx.neftaly.myapplication.R.string.count

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Holi", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }


    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the current value of the text view.
        val countString = textView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}
