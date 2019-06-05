package com.wk.factoryMethod.idcard

import com.wk.factoryMethod.framework.Product

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
class IdCard(name:String):Product(name) {
    override fun use() {
        println("use : "+name)
    }
}