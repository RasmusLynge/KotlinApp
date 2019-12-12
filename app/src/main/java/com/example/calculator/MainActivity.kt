package com.example.calculator


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var action = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "1")
        })
        button2.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "2")
        })
        button3.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "3")
        })
        button3.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "3")
        })
        button4.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "4")
        })
        button5.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "5")
        })
        button6.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "6")
        })
        button7.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "7")
        })
        button8.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "8")
        })
        button9.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "9")
        })
        button0.setOnClickListener({
            helloLabel.setText(helloLabel.text.toString() + "0")
        })




        buttonMinus.setOnClickListener({
            action = "-"
            helloLabel.setText(helloLabel.text.toString() + "-")
        })
        buttonPlus.setOnClickListener({
            action = "+"
            helloLabel.setText(helloLabel.text.toString() + "+")
        })
        buttonTimes.setOnClickListener({
            action = "*"
            helloLabel.setText(helloLabel.text.toString() + "*")
        })
        buttonCalculate.setOnClickListener({
            val calcString = helloLabel.text.toString()
            val calcStringSub = calcString.split(action)
            //val engien = SriptEngineManger().getEngineByExtention("kts")!!
            var result = 0

            if (action == "+") {
                result = (calcStringSub[0].toInt()) + (calcStringSub[1].toInt())
            }
            if (action == "-") {
                result = (calcStringSub[0].toInt()) - (calcStringSub[1].toInt())
            }
            if (action == "*") {
                result = (calcStringSub[0].toInt()) * (calcStringSub[1].toInt())
            }
            Log.ERROR
            helloLabel.setText(result.toString())

        }
        )
        buttonClear.setOnClickListener({
            helloLabel.setText("")
        })
    }
}
