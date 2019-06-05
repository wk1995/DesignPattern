package com.wk.designPattern.prototype.deepAndshallow.shallow

import java.util.ArrayList

/**
 * <pre>
 * author : wk
 * e-mail : 122642603@qq.com
 * time   :2018/03/26
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
 * desc   :
</pre> *
 */
class CloneShallow : Cloneable {
    var age: Int = 0
    var name: String? = null
    var a: IntArray? = null
    var arrayList: ArrayList<String>? = null

    override fun toString(): String {
        return name + "  " + age + "  " + a!![0] + "  " + arrayList!![0]
    }

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): Any {
        return super.clone() as CloneShallow
    }
}
