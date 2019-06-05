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
object ShallowMain {

    @JvmStatic
    fun main(a: Array<String>) {
        val cloneShallow = CloneShallow()
        cloneShallow.age = 1
        cloneShallow.name = "wk"
        val i = intArrayOf(1)
        val list = ArrayList<String>()
        list.add("list")
        cloneShallow.arrayList = list
        cloneShallow.a = i
        println("拷贝前  cloneShallow:" + cloneShallow.toString())
        try {
            val cloneShallow1 = cloneShallow.clone() as CloneShallow

            cloneShallow1.age = 2
            cloneShallow1.name = "wk1"
            var age = cloneShallow1.age
            age = 3
            val ii = cloneShallow1.a
            if(ii!=null)
                ii[0]=2
            val list1 = cloneShallow1.arrayList
            list1!!.add(0, "other")


            /**
             * 这里是直接换了属性了，所以不会改变cloneShallow的成员
             */
            //            int[] ii={2};
            //            cloneShallow1.setA(ii);
            println("修改后  cloneShallow:" + cloneShallow.toString())
            println("修改后  cloneShallow1:" + cloneShallow1.toString())
        } catch (e: CloneNotSupportedException) {

        }

    }
}
