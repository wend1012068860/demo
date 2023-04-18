package com.jmh.demo.utils;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/3/10
 * @description:
 */
public class BeanHolder {

    private static Object bean;

    public static void setBean(Object obj){
        BeanHolder.bean = obj;
    }

    public static <T> T getBean(){
        return (T) bean;
    }
}
