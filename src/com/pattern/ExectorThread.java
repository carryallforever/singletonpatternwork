package com.pattern;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/10 18:01
 * @Description:
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazysingleton = LazySingleton.getLazysingleton();
        System.out.println(Thread.currentThread().getName()+":"+lazysingleton);

    }
}
