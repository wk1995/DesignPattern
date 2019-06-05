package com.wk.designPattern.prototype.graphicDesignPattern

import com.wk.designPattern.prototype.graphicDesignPattern.framework.Manager

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
object AMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val manager = Manager()
        val underlinePen = UnderLinePen('*')
        val messageBox = MessageBox('+')
        val messageBox1 = MessageBox('/')
        manager.register("*", underlinePen)
        manager.register("+", messageBox)
        manager.register("/", messageBox1)
        //        manager.create("*").use("wk");
        //        manager.create("+").use("wk");
        //        manager.create("+").use("wk1111111111");
        //        manager.create("/").use("wk");
        println(manager.create("+")?:"" + "   " + manager.create("+"))
    }
}
