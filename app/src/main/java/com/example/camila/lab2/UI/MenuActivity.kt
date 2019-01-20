package com.example.camila.lab2.UI

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.camila.lab2.R
import com.example.camila.lab2.Logic.MyMenuOrder
import com.example.camila.lab2.MainActivity


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Se crea el arreglo con las opciones del menu
        val opciones: ArrayList<String> = arrayListOf("Matcha Latte   [Q42.00]", "Buddha Bowl   [Q72.00]", "Quinoa Sushi  [Q60.00]", "Tumeric Soup    [Q45.00]", "Falafel Wrap    [Q68.00]")

        //Se añade el menu a la listView y se establece el adaptador
        val listViewMenu = findViewById<ListView>(R.id.listview_1)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, opciones)
        listViewMenu.setAdapter(adapter)
        listViewMenu.setOnItemClickListener { parent, view, position, id ->
            //Se agrega la opcion elegida y se muestra un mensaje
            val carrito: MyMenuOrder = (this.application as MyAplication).getOrder()
            carrito.add(opciones.get(position))
            Toast.makeText(this, "Se añadio exitosamente: ${parent.getItemAtPosition(position)}" , Toast.LENGTH_SHORT).show()
        }


    }

    //Boton para regresar a Home
    fun onClick_Back(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }




}