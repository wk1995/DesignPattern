package com.wk.designPattern.builder.classicBuilder

import com.wk.designPattern.builder.classicBuilder.builder.Builder
import com.wk.designPattern.builder.classicBuilder.builder.SkyWalkerProduct

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
class Director constructor(private val builder: Builder) {
    fun createSky(dataTran:String,joyStick:String): SkyWalkerProduct {
        builder.setDataTran(dataTran)
        builder.setJoyStick(joyStick)
        return builder.createSky()
    }
}
