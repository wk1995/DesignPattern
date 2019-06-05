package com.wk.designPattern.strategy

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/04/08
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
class Context {
    fun setStrategy(strategy: Strategy){
        strategy.way()
    }
}