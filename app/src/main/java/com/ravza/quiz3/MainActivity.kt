package com.ravza.quiz3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.TextView.OnEditorActionListener
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etSearch:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etSearch = findViewById(R.id.et_search)
        etSearch.setOnEditorActionListener(object : OnEditorActionListener{
            override fun onEditorAction(p0: TextView?, p1: Int, p2: KeyEvent?): Boolean {
                if (p1 == EditorInfo.IME_ACTION_SEARCH) {
                    Toast.makeText(this@MainActivity, "You searched ${etSearch.text} !", Toast.LENGTH_LONG).show()
                    return true
                }
                return false
            }

        })
    }
}