package com.wk



object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        val context=Context()
        context.setStrategy(Strategy1())
        context.setStrategy(Strategy2())
    }
}
