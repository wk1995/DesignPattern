package com.wk.deepAndshallow.shallow;

import java.util.ArrayList;

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/26
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
public class CloneShallow implements Cloneable {
    private int age;
    private String name;
    private int[] a;
    private ArrayList<String> arrayList;

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

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
        return name+"  "+age+"  "+a[0]+"  "+arrayList.get(0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (CloneShallow)super.clone();
    }
}
