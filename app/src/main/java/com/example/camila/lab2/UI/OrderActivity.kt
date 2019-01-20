package com.example.camila.lab2.UI

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.camila.lab2.Logic.MyMenuOrder
import com.example.camila.lab2.MainActivity
import com.example.camila.lab2.R

class OrderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        //Se obtienen datos para llena la listview de esta activity de pedidos
        val pedido = (this.application as MyAplication).getOrder()

        val listViewPedido = findViewById<ListView>(R.id.listview_2)
        //Se agrega el adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, pedido.menuOrder)
        listViewPedido.setAdapter(adapter)

        listViewPedido.setOnItemLongClickListener { parent, view, position, id ->
            pedido.del(position)
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Se elimino: ${parent.getItemAtPosition(position)} de tu pedido" , Toast.LENGTH_SHORT).show()
            true
        }

        //Si se desea borrar el pedido
        val borrar = findViewById<Button>(R.id.button7)
        borrar.setOnClickListener{
            pedido.clear()
            adapter.notifyDataSetChanged()
        }
        //Si se realiza un pedio
        val buy = findViewById<Button>(R.id.button8)
        buy.setOnClickListener{
            pedido.done()
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Haz realizado un pedido exitosamente\nEl repartidor llegará lo más pronto posible" , Toast.LENGTH_SHORT).show()
        }

    }
    //Boton para regresar a Home
    fun onClick_Home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
