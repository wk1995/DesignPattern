package com.wk.ClassicBuilder.builder

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2018/03/27
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
interface Builder {

    fun setDataTran(s:String)
    fun setJoyStick(s:String)
    fun createSky(): SkyWalkerProduct


}