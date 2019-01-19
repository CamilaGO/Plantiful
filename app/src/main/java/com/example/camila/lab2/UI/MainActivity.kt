package com.example.camila.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.camila.lab2.UI.MenuActivity
import com.example.camila.lab2.UI.OrderActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick_Menu(view: View){
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
    fun onClick_Pedido(view: View){
        val intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }
}
