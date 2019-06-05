package com.wk.designPattern.singleton.staticClass

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/20
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
class SingletonStaticClass private constructor() {
    companion object {
        object B{
            val mSingletonStaticClass=SingletonStaticClass()
        }
        fun getInstance()=B.mSingletonStaticClass
    }
}