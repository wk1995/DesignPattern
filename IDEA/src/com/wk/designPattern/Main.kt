package com.wk.designPattern


/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   : 2019/6/5
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
class Main {
    /**
     * 设计模式枚举类
     * @param packageName 所在的包名
     * @param desc 该设计模式的描述
     *
     * */
    enum class DesignPattern(packageName:String,desc:String=""){
        Adapter("adapter","适配器模式"),
        Bridge("bridge","桥接模式"),
        Builder("builder","构建者模式"),
        Factory("factory","工厂模式"),
        Prototype("prototype","原型模式"),
        Singleton("singleton","单例模式"),
        Strategy("strategy","策略模式"),
        Template("template","模板模式");
    }
}