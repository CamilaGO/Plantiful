package com.example.camila.lab2.UI

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.camila.lab2.Logic.MyMenuOrder
import com.example.camila.lab2.MainActivity
import com.example.camila.lab2.R

class OrderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val compras: ListView = findViewById(R.id.listview_2)


    }
    fun onClick_Home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
