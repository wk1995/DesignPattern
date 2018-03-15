package com.wk.factoryMethod.framework

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/14
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
abstract class AbstractFactory {
    fun create(name:String):Product{
        val product=createProduct(name);
        registerProduct(product)
        return product
    }

    abstract fun createProduct(name:String):Product
    abstract fun registerProduct(product: Product)
}