package com.pattern;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/10 17:58
 * @Description:
 */
public class LazySingleton {

    private static LazySingleton lazysingleton;

    private LazySingleton(){}

    public static LazySingleton getLazysingleton(){
        if(lazysingleton == null){
            synchronized (LazySingleton.class){
                if(lazysingleton == null){
                   lazysingleton = new LazySingleton();
                }
            }
        }
        return lazysingleton;
    }

    private Object readResolve(){
        return lazysingleton;
    }
}
