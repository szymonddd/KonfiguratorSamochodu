package com.example.konfiguratorsamochodu

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val autosedan = findViewById<RadioButton>(R.id.sedan)
        val autosuv = findViewById<RadioButton>(R.id.suv)
        val autohatchback = findViewById<RadioButton>(R.id.hatchback)
        val przycisk = findViewById<Button>(R.id.button_submit)
        val wynik = findViewById<TextView>(R.id.textViewPodsumowanie)
        val zdj = findViewById<ImageView>(R.id.imageViewzdj)
        val klimatyzacja = findViewById<CheckBox>(R.id.klima)
        val skorzanesiedzenia = findViewById<CheckBox>(R.id.siedzenie)

        autosedan.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                zdj.setImageResource(R.drawable.sedan)
                zdj.visibility = View.VISIBLE
            }
        }

        autosuv.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                zdj.setImageResource(R.drawable.suv)
                zdj.visibility = View.VISIBLE
            }
        }

        autohatchback.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                zdj.setImageResource(R.drawable.hatchback)
                zdj.visibility = View.VISIBLE
            }
        }

        przycisk.setOnClickListener {
            if (klimatyzacja.isChecked && skorzanesiedzenia.isChecked) {
                wynik.setBackgroundColor(Color.GREEN)
                if (autosedan.isChecked) {
                    wynik.setText("Twoja konfiguracja: Sedan +klimatyzacja +skórzane siedzenia")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autosuv.isChecked) {
                    wynik.setText("Twoja konfiguracja: SUV +klimatyzacja +skórzane siedzenia")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autohatchback.isChecked) {
                    wynik.setText("Twoja konfiguracja: Hatchback +klimatyzacja +skórzane siedzenia")
                    wynik.setBackgroundColor(Color.GREEN)

                }
            }
            if (klimatyzacja.isChecked && !skorzanesiedzenia.isChecked)
                if (autosedan.isChecked) {
                    wynik.setText("Twoja konfiguracja: Sedan +klimatyzacja")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autosuv.isChecked) {
                    wynik.setText("Twoja konfiguracja: SUV +klimatyzacja")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autohatchback.isChecked) {
                    wynik.setText("Twoja konfiguracja: Hatchback +klimatyzacja")
                    wynik.setBackgroundColor(Color.GREEN)
                }
            if (!klimatyzacja.isChecked && skorzanesiedzenia.isChecked)
                if (autosedan.isChecked) {
                    wynik.setText("Twoja konfiguracja: Sedan +skórzane siedzenia")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autosuv.isChecked) {
                    wynik.setText("Twoja konfiguracja: SUV +skórzane siedzenia")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autohatchback.isChecked) {
                    wynik.setText("Twoja konfiguracja: Hatchback +skórzane siedzenia")
                    wynik.setBackgroundColor(Color.GREEN)
                }
            if (!klimatyzacja.isChecked && !skorzanesiedzenia.isChecked)
                if (autosedan.isChecked) {
                    wynik.setText("Twoja konfiguracja: Sedan")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autosuv.isChecked) {
                    wynik.setText("Twoja konfiguracja: SUV")
                    wynik.setBackgroundColor(Color.GREEN)
                } else if (autohatchback.isChecked) {
                    wynik.setText("Twoja konfiguracja: Hatchback")
                    wynik.setBackgroundColor(Color.GREEN)
                }
        }
    }
}