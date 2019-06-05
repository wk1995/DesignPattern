package com.wk.designPattern.template


object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val addSubClass:AbstractTemplete=AddSubclass()
        val reduceSubClass:AbstractTemplete=ReduceSubClass()
        addSubClass.show();
        reduceSubClass.show()
    }
}
