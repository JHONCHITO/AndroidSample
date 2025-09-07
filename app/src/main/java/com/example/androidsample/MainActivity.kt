package com.example.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etDolares: EditText
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etDolares = findViewById(R.id.etDolares)
        tvResultado = findViewById(R.id.tvResultado)
    }

    // Este método lo llama el botón por android:onClick="convertCurrency"
    fun convertCurrency(view: View) {
        val texto = etDolares.text.toString().trim()
        val dolares = texto.toFloatOrNull()

        if (dolares == null) {
            tvResultado.text = getString(R.string.sin_valor)
            return
        }

        val tasa = 0.85f
        val valorEuro = dolares * tasa
        tvResultado.text = valorEuro.toString()
    }
}
