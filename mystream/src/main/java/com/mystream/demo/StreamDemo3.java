package com.mystream.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        /**
         *  distinct  元素去重，依赖hashCode和equals方法
         *  concat    合并a和b两个流为一个流
         */

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌","周芷若","赵敏","张强","王二麻子","蔡徐坤","蔡徐坤","蔡徐坤","蔡徐坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张三丰","张翠山","张良");

        // 去重
        //list1.stream().distinct().forEach(s -> System.out.println(s));

        // 合并
        Stream.concat(list1.stream(), list2.stream()).distinct().forEach(s -> System.out.println(s));
    }
}
