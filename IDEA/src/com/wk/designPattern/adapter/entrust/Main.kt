
package com.wk.designPattern.adapter.entrust

import com.wk.designPattern.entrust.AdapterAbstract


/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/03/12
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
object Main {

    @JvmStatic
    fun main(a:Array<String>){
        val adapterAbstract: AdapterAbstract = Adapter()
        adapterAbstract.abstractPrint()
    }
}