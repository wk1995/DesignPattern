package com.wk.designPattern.prototype.graphicDesignPattern.framework

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
interface Product : Cloneable {
    fun use(s: String)
    fun createClone(): Product?
}