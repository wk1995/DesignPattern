package com.wk.designPattern.bridge.displayImp

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/29
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
class ReduceDisplayImp: DisplayImp {
    override fun open() {
        println("----------")
    }

    override fun done() {
        println("---done---")
    }


    override fun close() {
        println("----------")
    }
}