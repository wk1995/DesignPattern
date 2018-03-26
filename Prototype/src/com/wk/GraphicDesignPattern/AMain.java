package com.wk.GraphicDesignPattern;

import com.wk.GraphicDesignPattern.framework.Manager;
import org.jetbrains.annotations.NotNull;

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
public class AMain {
    public static final void main(@NotNull String[] args) {
        Manager manager = new Manager();
        UnderLinePen underlinePen = new UnderLinePen('*');
        MessageBox messageBox = new MessageBox('+');
        MessageBox messageBox1 = new MessageBox('/');
        manager.register("*", underlinePen);
        manager.register("+", messageBox);
        manager.register("/",messageBox1);
//        manager.create("*").use("wk");
//        manager.create("+").use("wk");
//        manager.create("+").use("wk1111111111");
//        manager.create("/").use("wk");
        System.out.println(manager.create("+")+"   "+manager.create("+"));
    }
}
