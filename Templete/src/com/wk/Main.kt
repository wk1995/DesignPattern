package com.wk

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val addSubClass:AbstractTemplete=AddSubclass()
        val reduceSubClass:AbstractTemplete=ReduceSubClass()
        addSubClass.show();
        reduceSubClass.show()
    }
}
