package com.wk.simpleFactory.product


/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/15
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
object NumberFactory {

    fun createNumber(flag:Int): Number?{
        when(flag){
            1-> return First()
            2-> return Second()
            else-> return null
        }
    }
}