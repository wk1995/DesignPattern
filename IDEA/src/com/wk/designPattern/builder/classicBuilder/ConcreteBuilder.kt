package com.wk.designPattern.builder.classicBuilder

import com.wk.designPattern.builder.classicBuilder.builder.Builder
import com.wk.designPattern.builder.classicBuilder.builder.SkyWalkerProduct

/**
 * <pre>
 * author : wk
 * e-mail : 122642603@qq.com
 * time   :2018/03/27
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
 * desc   :
</pre> *
 */
class ConcreteBuilder: Builder {
    private val skyWalkerProduct= SkyWalkerProduct()
    override fun setDataTran(s:String) {
        skyWalkerProduct.dataTran=s
    }
    override fun setJoyStick(s:String) {
        skyWalkerProduct.joyStick=s
    }
    override fun createSky()=skyWalkerProduct
}
