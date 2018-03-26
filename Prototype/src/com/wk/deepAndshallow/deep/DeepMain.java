package com.wk.deepAndshallow.deep;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import com.wk.deepAndshallow.shallow.CloneShallow;

import java.io.*;
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
public class DeepMain {

    public static void main(String[] a) {
        System.out.println("ArrayList:");
        test1();
        System.out.println("int[] :");
        test2();
    }

    static void test1() {
        CloneDeep cloneDeep = new CloneDeep();
        cloneDeep.setAge(1);
        cloneDeep.setName("wk");
        ArrayList<String> list = new ArrayList<>();
        list.add("list");
        cloneDeep.setList(list);
        System.out.println("拷贝前  CloneDeep:" + cloneDeep.toString());
        try {
            CloneDeep cloneDeep1 = (CloneDeep) cloneDeep.clone();
            cloneDeep1.setAge(2);
            cloneDeep1.setName("wk1");
            int age = cloneDeep1.getAge();
            age = 3;
            ArrayList<String> list1 = cloneDeep1.getList();
            list1.add(0, "other");
            System.out.println("修改后  CloneDeep:" + cloneDeep.toString());
            System.out.println("修改后  CloneDeep1:" + cloneDeep1.toString());
        } catch (CloneNotSupportedException e) {

        }
    }
    static void test2() {
        CloneDeep1 cloneDeep = new CloneDeep1();
        cloneDeep.setAge(1);
        cloneDeep.setName("wk");
        int[] i = {1};
        cloneDeep.setA(i);
        System.out.println("拷贝前  cloneDeep1:" + cloneDeep.toString());
        CloneDeep1 cloneDeep1 = (CloneDeep1) deepCloneObject(cloneDeep);
        cloneDeep1.setAge(2);
        cloneDeep1.setName("wk1");
        int age = cloneDeep1.getAge();
        age = 3;
        int[] ii = cloneDeep1.getA();
        ii[0] = 2;
        cloneDeep1.setA(ii);
        System.out.println("修改后  cloneDeep:" + cloneDeep.toString());
        System.out.println("修改后  cloneDeep1:" + cloneDeep1.toString());

    }

    private static Object deepCloneObject(Object object) {
        Object cloneDeep1=null;
        try {
            if (object != null) {
                // 将对象写到流里
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(object);
                oos.close();
                // 将对象从流里读出来
                ByteArrayInputStream bais = new ByteArrayInputStream(baos
                        .toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bais);
                cloneDeep1 = ois.readObject();
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cloneDeep1;
    }
}
