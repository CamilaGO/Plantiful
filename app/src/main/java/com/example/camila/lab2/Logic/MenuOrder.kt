package com.example.camila.lab2.Logic

interface MenuOrder {

    val menuOrder: ArrayList<String> // Pedido

    fun clear() // Limpiar pedido
    fun add(element: String) // Agregar elemento
    fun del(elementIndex: Int) // Elimina elemento
    fun done() // Realiza pedido
}