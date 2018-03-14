package com.example.lucas.mykotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.support.design.widget.Snackbar;

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var toastButton: Button
    lateinit var nextButton: Button
    lateinit var parentLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.center_button)
        toastButton = findViewById(R.id.toast_button)
        parentLayout = findViewById(R.id.parent_layout)
        nextButton = findViewById(R.id.next_button)


        button.setOnClickListener { snackbar("Button click") }
        toastButton.setOnClickListener { toast("Toast button")}
        nextButton.setOnClickListener { startImageActivity() }
        toast("Say hello!")

        snackbar("Bello")

        setTitle("Mapache")
    }

    private fun startImageActivity() {
        val imageActivityIntent = Intent(this, ImageActivity::class.java)
        startActivity(imageActivityIntent)
    }

    private fun snackbar(message: String) {
        Snackbar.make(parentLayout, message, Snackbar.LENGTH_SHORT).show()
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
    }


}
