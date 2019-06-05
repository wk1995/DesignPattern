package com.wk.designPattern.prototype.deepAndshallow.deep

import java.io.Serializable

/**
 * <pre>
 * author : wk
 * e-mail : 122642603@qq.com
 * time   :2018/03/26
 * GitHub : https://github.com/wk1995
 * CSDN   : http://blog.csdn.net/qq_33882671
 * desc   : 如果里面的引用类型的成员变量并不是继承Cloneable的就可
 * 以用序列化实现深度拷贝
</pre> *
 */
class CloneDeep1 : Serializable {
    var age: Int = 0
    var name: String? = null
    var a: IntArray? = null

    override fun toString(): String {
        return name + "  " + age + "  " + a!![0]
    }

}
