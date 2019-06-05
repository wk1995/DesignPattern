package com.wk.designPattern.prototype.graphicDesignPattern

import com.wk.designPattern.prototype.graphicDesignPattern.framework.Product

/**
 * <pre>
 * author : wk
 * e-mail : 122642603@qq.com
 * time   :2018/03/24
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
 * desc   :
</pre> *
 */
internal class MessageBox(private val aChar: Char) : Product {

    override fun use(s: String) {
        val size = s.toByteArray().size
        for (i in 0 until size + 4) {
            print(aChar)
        }
        println("")
        println(s)
        for (i in 0 until size + 4) {
            print(aChar)
        }
        println("")
    }

    override fun createClone(): Product? {
        var p: Product? = null
        try {
            p = clone() as Product
        } catch (e: CloneNotSupportedException) {

        }

        return p
    }
}