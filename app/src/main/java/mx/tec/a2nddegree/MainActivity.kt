package mx.tec.a2nddegree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Code for the Calculation button

        val buttonCalculate : Button =findViewById(R.id.calculateButton)
        buttonCalculate.setOnClickListener(){

        }
    }
}