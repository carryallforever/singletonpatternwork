package com.pattern;

import javax.jws.Oneway;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: zhouyao
 * @Date: 2019/3/10 19:31
 * @Description:
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else {
                return ioc.get(className);
            }
        }
    }
}
