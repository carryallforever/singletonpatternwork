package com.pattern;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/10 19:24
 * @Description:
 */
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData(){
        return  data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
