package com.wk.usualBuilder;

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/30
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
public class UsualProduct {
    private int i1;
    private int i2;
    private int i3;

    private UsualProduct(Builder builder) {
        this.i1 = builder.i1;
        this.i2 = builder.i2;
        this.i3 = builder.i3;
    }

    public class Builder {
        private int i1;
        private int i2;
        private int i3;

        public void setI1(int i1) {
            this.i1 = i1;
        }

        public void setI2(int i2) {
            this.i2 = i2;
        }

        public void setI3(int i3) {
            this.i3 = i3;
        }

        public UsualProduct build() {
            return new UsualProduct(this);
        }
    }
}
