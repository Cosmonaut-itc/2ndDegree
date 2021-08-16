package mx.tec.a2nddegree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add edit text Variables
        val addAtext : EditText=findViewById(R.id.addAText)
        val addBtext : EditText=findViewById(R.id.addBtext)
        val addCtext : EditText=findViewById(R.id.addCText)

        //add result text variables
        val textResult1 : TextView=findViewById(R.id.resultText1)
        val textResult2 : TextView=findViewById(R.id.textResult2)

        //Code for the Calculation button
        val buttonCalculate : Button =findViewById(R.id.calculateButton)
        buttonCalculate.setOnClickListener(){
            if(addAtext.text.toString().isEmpty() || addBtext.text.toString().isEmpty() || addCtext.text.toString().isEmpty()){
                Log.e("LOGTAG", "You need all of the variables")
            }
            else{

            }
        }
    }
}