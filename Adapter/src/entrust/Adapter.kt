package entrust

import Adaptee

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/12
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 适配器
 * </pre>
 */
class Adapter(): AdapterAbstract() {

    var adaptee: Adaptee?=null
    init {
        adaptee= Adaptee()
    }

    override fun abstractPrint() {
        System.out.println("entrust")
    }
}