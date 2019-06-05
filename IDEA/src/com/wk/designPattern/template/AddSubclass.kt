package com.wk.designPattern.template


/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/13
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
class AddSubclass:AbstractTemplete() {
    override fun start() {
        println("this is addSubclass start")
    }

    override fun done() {
        println("this is addSubclass done")
    }

    override fun end() {
        println("this is addSubclass end")
    }
}