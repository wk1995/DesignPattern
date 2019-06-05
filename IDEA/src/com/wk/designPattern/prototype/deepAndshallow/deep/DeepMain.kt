package com.wk.designPattern.prototype.deepAndshallow.deep

import java.io.*
import java.util.*

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
object DeepMain {

    @JvmStatic
    fun main(a: Array<String>) {
        println("ArrayList:")
        test1()
        println("int[] :")
        test2()
    }

    internal fun test1() {
        val cloneDeep = CloneDeep()
        cloneDeep.age = 1
        cloneDeep.name = "wk"
        val list = ArrayList<String>()
        list.add("list")
        cloneDeep.list = list
        println("拷贝前  CloneDeep:" + cloneDeep.toString())
        try {
            val cloneDeep1 = cloneDeep.clone() as CloneDeep
            cloneDeep1.age = 2
            cloneDeep1.name = "wk1"
            var age = cloneDeep1.age
            age = 3
            val list1 = cloneDeep1.list
            list1!!.add(0, "other")
            println("修改后  CloneDeep:" + cloneDeep.toString())
            println("修改后  CloneDeep1:" + cloneDeep1.toString())
        } catch (e: CloneNotSupportedException) {

        }

    }

    internal fun test2() {
        val cloneDeep = CloneDeep1()
        cloneDeep.age = 1
        cloneDeep.name = "wk"
        val i = intArrayOf(1)
        cloneDeep.a = i
        System.out.println("拷贝前  cloneDeep1:" + cloneDeep.toString())
        val cloneDeep1 = deepCloneObject(cloneDeep) as CloneDeep1?
        cloneDeep1!!.age = 2
        cloneDeep1!!.name = "wk1"
        var age = cloneDeep1!!.age
        age = 3
        val ii = cloneDeep1!!.a
        if (ii != null)
            ii[0] = 2
        cloneDeep1!!.a = ii
        System.out.println("修改后  cloneDeep:" + cloneDeep.toString())
        System.out.println("修改后  cloneDeep1:" + cloneDeep1!!.toString())

    }

    private fun deepCloneObject(`object`: Any?): Any? {
        var cloneDeep1: Any? = null
        try {
            if (`object` != null) {
                // 将对象写到流里
                val baos = ByteArrayOutputStream()
                val oos = ObjectOutputStream(baos)
                oos.writeObject(`object`)
                oos.close()
                // 将对象从流里读出来
                val bais = ByteArrayInputStream(baos
                        .toByteArray())
                val ois = ObjectInputStream(bais)
                cloneDeep1 = ois.readObject()
                ois.close()
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }

        return cloneDeep1
    }
}
