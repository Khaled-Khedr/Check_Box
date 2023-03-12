package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var checkBoxKotlin: CheckBox
    private lateinit var checkBoxJava: CheckBox
    private lateinit var checkBoxC: CheckBox
    private lateinit var textviewChoice:TextView
    private lateinit var SubmitButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxKotlin=findViewById(R.id.checkBoxKotlin) //connecting objects to Widgets
        checkBoxJava=findViewById(R.id.checkBoxJava)
        checkBoxC=findViewById(R.id.checkBoxC)
        textviewChoice=findViewById(R.id.textViewChoices)
        SubmitButton=findViewById(R.id.Submit_Button)

        SubmitButton.setOnClickListener {

            //we need an instance of the string builder class
            val sb=StringBuilder() //used for appending and many other things
            sb.append(checkBoxKotlin.text.toString()+" Submission is: "+checkBoxKotlin.isChecked+"\n")
            sb.append(checkBoxJava.text.toString()+" Submission is: "+checkBoxJava.isChecked+"\n")
            sb.append(checkBoxC.text.toString()+" Submission is: "+checkBoxC.isChecked+"\n")

            textviewChoice.text=sb.toString()//making sure its a string type since text is a string


        }
    }
}