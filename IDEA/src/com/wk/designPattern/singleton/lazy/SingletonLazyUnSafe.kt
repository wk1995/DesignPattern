package com.wk.designPattern.singleton.lazy

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
class SingletonLazyUnSafe private constructor() {
    companion object {
        private var mSingletonLazyUnSafe:SingletonLazyUnSafe?=null
        fun getInstance():SingletonLazyUnSafe{
            if(mSingletonLazyUnSafe==null)
                mSingletonLazyUnSafe= SingletonLazyUnSafe()
            return mSingletonLazyUnSafe!!
        }
    }
}