package com.wk.designPattern.templete

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/13
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 父类模板，show不需要更改，对于子类来说都，show都
 *                 是一样的
 * </pre>
 */
abstract class AbstractTemplete {
    protected abstract fun start()
    protected abstract fun done()
    protected abstract fun end()
    fun show(){
        start()
        done()
        end()
    }

}