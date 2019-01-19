package com.example.camila.lab2.UI

import android.app.Application
import com.example.camila.lab2.Logic.MyMenuOrder

class MyAplication: Application() {
    val orden: MyMenuOrder = MyMenuOrder()

    fun getOrder(): MyMenuOrder {
        //Devuelve la orden que es de tipo MyMenuOrder
        return orden
    }


}