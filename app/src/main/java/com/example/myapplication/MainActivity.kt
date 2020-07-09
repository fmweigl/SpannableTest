package com.example.myapplication

import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSpan = ImageSpan(this, R.drawable.icon)
        val builder = SpannableStringBuilder(" ")
        builder.setSpan(
            imageSpan,
            0,
            1,
            SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        Snackbar.make(findViewById(R.id.container), "Hello Snackbar", Snackbar.LENGTH_INDEFINITE)
            .setAction(builder) {}.show()
    }
}