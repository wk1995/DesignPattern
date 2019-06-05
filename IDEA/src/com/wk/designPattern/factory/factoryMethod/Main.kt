package com.wk.factoryMethod

import com.wk.factoryMethod.idcard.IdCardFactory

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val product1=IdCardFactory().createProduct()
        product1.use()
    }

}
