package com.example.entradadatosportecladoconsolakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setText (view: View){
        val button = findViewById<Button>(R.id.bt1)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)

        button.setOnClickListener {

            val primerNumero = et1.text.toString().toFloat()
            val segundoNumero = et2.text.toString().toFloat()

            val sumatorio = primerNumero + segundoNumero
            println("El sumatorio equivale a: \n $sumatorio")
            val producto = primerNumero * segundoNumero
            println("El sumatorio equivale a: \n $producto")

            val tv1 = findViewById<TextView>(R.id.tv1).apply {
                text = ("El sumatorio equivale a: $sumatorio \n y el producto equivale a: $producto ").toString()
            }
        }
    }
}