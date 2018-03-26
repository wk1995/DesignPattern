package com.wk.GraphicDesignPattern.framework;

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
public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}