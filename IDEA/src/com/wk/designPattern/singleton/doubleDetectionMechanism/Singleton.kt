package com.wk.designPattern.singleton.doubleDetectionMechanism
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
class Singleton private constructor() {
    companion object {
        @Volatile
        var mSingleton:Singleton?=null
        fun getInstance(): Singleton {
            if(mSingleton==null) {
                synchronized(Singleton::class.java) {
                    if (mSingleton == null)
                        mSingleton = Singleton()
                }
            }
            return mSingleton!!
        }
    }
}