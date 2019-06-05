package com.wk.designPattern.singleton

import com.wk.designPattern.singleton.enum.SingletonEnum

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            //获得构造器
            val con = SingletonEnum::class.java.getDeclaredConstructor()
            //设置为可访问
            con.isAccessible=(true)
            //构造两个不同的对象
            val singleton1 = con.newInstance() as SingletonEnum
            val singleton2 = con.newInstance() as SingletonEnum
            //验证是否是不同对象
            System.out.println(singleton1==(singleton2))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}
