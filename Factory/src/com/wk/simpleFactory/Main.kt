package com.wk.simpleFactory

import com.wk.simpleFactory.product.NumberFactory

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val number= NumberFactory.createNumber(1)
        number!!.desc()
    }
}