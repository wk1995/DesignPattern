package com.wk.display

import com.wk.displayImp.DisplayImp

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
open class Display(private val displayImp: DisplayImp) {

    fun display(){
        displayImp.open()
        displayImp.done()
        displayImp.close()
    }
}