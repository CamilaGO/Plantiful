package com.example.camila.lab2.UI

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.camila.lab2.R
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.camila.lab2.Logic.MyMenuOrder
import com.example.camila.lab2.MainActivity


class MenuActivity : AppCompatActivity() {

    val arreglo = arrayOf("Matcha Latte   [Q42.00]", "Buddha Bowl   [Q72.00]", "Quinoa Sushi  [Q60.00]", "Tumeric Soup    [Q45.00]", "Falafel Wrap    [Q68.00]")
    //val app: MyAplication = MyAplication() //Se instancia un elementos de tipo MyApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val adapter = ArrayAdapter(this, R.layout.listview_item, arreglo)

        val listViewMenu: ListView = findViewById(R.id.listview_1)
        listViewMenu.setAdapter(adapter)


        listViewMenu.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                // valor de objeto que es presionado
                val itemValue = listViewMenu.getItemAtPosition(position) as String

                val order: MyMenuOrder = (this.application as MyAplication).getOrder()
                order.add(itemValue)
                adapter.notifyDataSetChanged()

                // Toast the values
                Toast.makeText(applicationContext,
                    "Se ha agregado : $itemValue", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    fun onClick_Back(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}