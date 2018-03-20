package com.wk.hungry

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
class SingletonHungry private constructor() {
    companion object {
        private val mSingletonHungryUnSafe= SingletonHungry()
        fun getInstance(): SingletonHungry {
            return mSingletonHungryUnSafe
        }
    }
}