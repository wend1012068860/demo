package com.mystream.demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        /**
         *  filter 过滤
         *  limit  获取前几个元素
         *  skip   跳过前几个元素
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","蔡徐坤");

        // 过滤张开头的， 长度为3的，并打印
//        list.stream().filter(s -> s.startsWith("张"))
//                .filter(s -> s.length() == 3)
//                .forEach(s -> System.out.println(s));

        // 获取前几个元素
        //list.stream().limit(3).forEach(s -> System.out.println(s));

        // 跳过前几个元素
        //list.stream().skip(3).forEach(s -> System.out.println(s));

        // 获取 "张强","张三丰","张翠山"
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
        list.stream().limit(6).skip(3).forEach(s -> System.out.println(s));
    }
}
