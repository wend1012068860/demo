package com.mystream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        /**
         *  void forEach(Consumer action)  遍历
         *  long count                     统计
         *  toArray()                      收集流中的数据，放到数组中
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","蔡徐坤");

        // 遍历
        //list.stream().forEach(s -> System.out.println(s));

        // 统计
//        long count = list.stream().count();
//        System.out.println(count);

        // toArray()
        Object[] objects = list.stream().toArray();
        System.out.println(Arrays.toString(objects));

        String[] strings = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(strings));

    }
}
