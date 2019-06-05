package com.wk.designPattern.singleton.lazy.threadSafe

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
class SingletonLazySafe private constructor() {
    companion object {
        private var mSingletonLazySafe:SingletonLazySafe?=null
        @Synchronized
        fun getInstance():SingletonLazySafe{
            if(mSingletonLazySafe==null)
                mSingletonLazySafe=SingletonLazySafe()
            return mSingletonLazySafe!!
        }
    }


}