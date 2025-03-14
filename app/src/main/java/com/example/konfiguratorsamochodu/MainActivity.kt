package com.example.konfiguratorsamochodu

import android.os.Bundle
import android.view.View
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
    private lateinit var radioGroupCarModel: RadioGroup
    private lateinit var radioSedan: RadioButton
    private lateinit var radioSUV: RadioButton
    private lateinit var radioHatchback: RadioButton
    private lateinit var checkboxAC: CheckBox
    private lateinit var checkboxLeatherSeats: CheckBox
    private lateinit var imageViewSedan: ImageView
    private lateinit var imageViewSUV: ImageView
    private lateinit var imageViewHatchback: ImageView
    private lateinit var textViewSummary: TextView
