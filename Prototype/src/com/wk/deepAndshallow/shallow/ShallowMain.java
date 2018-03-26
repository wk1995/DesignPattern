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
public class ShallowMain {

    public static void main(String[] a){
        CloneShallow cloneShallow=new CloneShallow();
        cloneShallow.setAge(1);
        cloneShallow.setName("wk");
        int[] i={1};
        ArrayList<String> list=new ArrayList<>();
        list.add("list");
        cloneShallow.setArrayList(list);
        cloneShallow.setA(i);
        System.out.println("拷贝前  cloneShallow:"+cloneShallow.toString());
        try {
            CloneShallow cloneShallow1 =(CloneShallow) cloneShallow.clone();

            cloneShallow1.setAge(2);
            cloneShallow1.setName("wk1");
            int age=cloneShallow1.getAge();
            age=3;
            int[] ii=cloneShallow1.getA();
            ii[0]=2;
            ArrayList<String> list1=cloneShallow1.getArrayList();
            list1.add(0,"other");


            /**
            * 这里是直接换了属性了，所以不会改变cloneShallow的成员
            * */
//            int[] ii={2};
//            cloneShallow1.setA(ii);
            System.out.println("修改后  cloneShallow:"+cloneShallow.toString());
            System.out.println("修改后  cloneShallow1:"+cloneShallow1.toString());
        }catch (CloneNotSupportedException e){

        }
    }
}
