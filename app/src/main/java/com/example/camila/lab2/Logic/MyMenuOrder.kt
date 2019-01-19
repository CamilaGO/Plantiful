package com.example.camila.lab2.Logic

class MyMenuOrder: MenuOrder{
    override val menuOrder: ArrayList<String> = arrayListOf(" ") // Pedido

    override fun clear() {
        // Limpiar pedido
        menuOrder.clear()
    }
    override fun add(element: String){
        // Agregar elemento a menuOrder
        menuOrder.add(element)
    }
    override fun del(elementIndex: Int){
        // Elimina elemento
        menuOrder.removeAt(elementIndex)
    }
    override fun done(){
        // Realiza pedido
        menuOrder.clear()
    }

}