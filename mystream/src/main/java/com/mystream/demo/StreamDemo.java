package com.mystream.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo {
    public static void main(String[] args) {
        /**
         * 创建集合添加元素，完成以下需求：
         * 1.把所有以 “张” 开头的元素存储到新集合中
         * 2.把“张”开头，长度为3的元素再存储到新集合中
         * 3.遍历打印最终结果
         */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张三");
        list1.add("张三丰");

//        //1.把所有以 “张” 开头的元素存储到新集合中
//        ArrayList<String> list2 = new ArrayList<>();
//        for (String name : list1) {
//            if (name.startsWith("张")){
//                list2.add(name);
//            }
//        }
//
//        //2.把“张”开头，长度为3的元素再存储到新集合中,遍历打印最终结果
//        ArrayList<String> list3 = new ArrayList<>();
//        for (String name : list2) {
//            if (name.length() == 3){
//                list3.add(name);
//            }
//        }
//
//        //3.遍历打印最终结果
//        for (String name : list3) {
//            System.out.println(name);
//        }

        // stream流
        list1.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

    }
}
