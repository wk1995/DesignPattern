package com.wk.deepAndshallow.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/26
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   : ArrayList也继承Cloneable
 * </pre>
 */
public class CloneDeep implements Cloneable {
    private int age;
    private String name;
    private ArrayList<String> list;

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

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneDeep cloneDeep;
        cloneDeep=(CloneDeep)super.clone();
        cloneDeep.list=(ArrayList<String>)list.clone();
        return cloneDeep;
    }

    @Override
    public String toString() {
        return name+"   "+age+"   "+list.get(0);
    }
}
