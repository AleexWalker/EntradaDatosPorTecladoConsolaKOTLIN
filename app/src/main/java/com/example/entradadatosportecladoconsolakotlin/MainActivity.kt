package com.example.entradadatosportecladoconsolakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setText (view: View){
        val button = findViewById<Button>(R.id.bt1)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val et4 = findViewById<EditText>(R.id.et4)

        //et1.doAfterTextChanged {

        //}
        button.setOnClickListener {

            val primerNumero = et1.text.toString().toFloat()
            val segundoNumero = et2.text.toString().toFloat()
            val tercerNumero = et3.text.toString().toFloat()
            val cuartoNumero = et4.text.toString().toFloat()

            val totalSuma = primerNumero + segundoNumero + tercerNumero + cuartoNumero
            val media = totalSuma / 4

            println("El sumatorio equivale a: \n $totalSuma")
            println("La media equivale a: \n $media")

            val tv1 = findViewById<TextView>(R.id.tv1).apply {
                text = ("El sumatorio equivale a: $totalSuma\nLa media equivale a: $media").toString()
            }
        }
    }
}