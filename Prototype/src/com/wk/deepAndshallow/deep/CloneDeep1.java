package com.wk.deepAndshallow.deep;

import com.wk.deepAndshallow.shallow.CloneShallow;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/26
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : 如果里面的引用类型的成员变量并不是继承Cloneable的就可
 *                 以用序列化实现深度拷贝
 * </pre>
 */
public class CloneDeep1 implements Serializable {
    private int age;
    private String name;
    private int[] a;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return name+"  "+age+"  "+a[0];
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (CloneDeep1)super.clone();
    }
}
