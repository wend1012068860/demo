package com.mystream.demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        /**
         *  map  转换流中的数据类型
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-1","周芷若-2","赵敏-3","张强-4","张三丰-5","张翠山-6","张良-7","王二麻子-8","蔡徐坤-9");

        // 取出数字 int
        list.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));

    }
}
