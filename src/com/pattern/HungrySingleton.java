package com.pattern;

/**
 * 饿汉式单例模式
 * @Auther: zhouyao
 * @Date: 2019/3/10 17:51
 * @Description:
 */
public class HungrySingleton {

//    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private static final HungrySingleton hungrySingleton;

    /**
     * 静态代码块方式实现单例模式
     */
    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton() {

    }

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
