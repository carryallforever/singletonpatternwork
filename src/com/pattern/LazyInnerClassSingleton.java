package com.pattern;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/10 18:14
 * @Description:
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){}

    //static是为了使单例的空间共享
    //final保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new  LazyInnerClassSingleton();
    }
}
