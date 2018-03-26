package com.wk.GraphicDesignPattern;

import com.wk.GraphicDesignPattern.framework.Product;

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/24
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
class MessageBox implements Product{
    private char aChar;
    public MessageBox(char aChar){
        this.aChar=aChar;
    }

    @Override
    public void use(String s) {
        int size=s.getBytes().length;
        for(int i=0;i<size+4;i++){
            System.out.print(aChar);
        }
        System.out.println("");
        System.out.println(s);
        for(int i=0;i<size+4;i++){
            System.out.print(aChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p=null;
        try {
            p = (Product) clone();
        }catch (CloneNotSupportedException e){

        }
        return p;
    }
}