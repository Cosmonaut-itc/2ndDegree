package mx.tec.a2nddegree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

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
        val errorMessage : TextView=findViewById(R.id.Error)

        //Code for the Calculation button
        val buttonCalculate : Button =findViewById(R.id.calculateButton)
        buttonCalculate.setOnClickListener{
            if(addAtext.text.toString().isEmpty() || addBtext.text.toString().isEmpty() || addCtext.text.toString().isEmpty()){
                errorMessage.text="You need to fill all of the variables"
            }
            else{
                val a = addAtext.text.toString().toFloat()
                val b = addBtext.text.toString().toFloat()
                val c = addCtext.text.toString().toFloat()

                val innerSquare = b*b-4*a*c

                if(innerSquare>0){
                    val pos = (-b + sqrt(innerSquare.toDouble()))/2*a
                    val neg = (-b - sqrt(innerSquare.toDouble()))/2*a
                    textResult1.text = pos.toString()
                    textResult2.text = neg.toString()
                }
                else{
                    errorMessage.text="Tried to do an square root in a negative"
                }


            }
        }
    }
}