package com.wk.designPattern.builder.classicBuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        val concreteBuilder = ConcreteBuilder()
        val director = Director(concreteBuilder)
        val sky = director.createSky("wkDataTran", "wkJoyStick")
        println(sky.toString())
    }
}
