package com.wk.factoryMethod

import com.wk.factoryMethod.idcard.IdCardFactory

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
      val product1=IdCardFactory().createProduct("wk1")
        val product2=IdCardFactory().createProduct("wk2")
        product1.use()
        product2.use()
    }
}
