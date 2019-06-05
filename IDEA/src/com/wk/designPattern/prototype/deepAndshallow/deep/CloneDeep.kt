package com.wk.designPattern.prototype.deepAndshallow.deep

import java.util.ArrayList

/**
 * <pre>
 * author : wk
 * e-mail : 122642603@qq.com
 * time   :2018/03/26
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
 * desc   : ArrayList也继承Cloneable
</pre> *
 */
class CloneDeep : Cloneable {
    var age: Int = 0
    var name: String? = null
    var list: ArrayList<String>? = null

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): Any {
        val cloneDeep: CloneDeep
        cloneDeep = super.clone() as CloneDeep
        cloneDeep.list = list!!.clone() as ArrayList<String>
        return cloneDeep
    }

    override fun toString(): String {
        return name + "   " + age + "   " + list!![0]
    }
}
