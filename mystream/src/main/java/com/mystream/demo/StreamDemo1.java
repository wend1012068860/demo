package com.mystream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        /**
         * 单列集合      default Stream<E> stream()                            Collection中的默认方法
         * 双列集合      无                                                    无法直接使用stream流
         * 数组         public static <T> Stream<T> stream(T[] array)         Arrays工具类中的静态方法
         * 一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
         */

        //1.单列集合获取Stream流
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "a","b","c","d","e");
//        list.stream().forEach(s -> System.out.println(s));

        //2.双列集合
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("aaa", 111);
//        map.put("bbb", 222);
//        map.put("ccc", 333);
//        map.put("ddd", 444);
//        map.keySet().stream().forEach(s -> System.out.println(s));
//        map.entrySet().stream().forEach(s -> System.out.println(s));

        //3.数组
//        int[] arr = {1,2,3,4,5};
//        String[] arr1 = {"a","b","c","d","e"};
//        Arrays.stream(arr).forEach(s -> System.out.println(s));
//        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        //4.一堆零散数据
//        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
//        Stream.of("a","b","c","d","e").forEach(s -> System.out.println(s));

        int[] arr = {1,2,3,4,5};
        String[] arr1 = {"a","b","c","d","e"};
        Stream.of(arr1).forEach(s -> System.out.println(s));

        /**
         * 注意点：
         * Stream接口中静态方法of的细节
         * 方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
         * 但是数组必须是引用数据类型，如果传递基本类型，是会把整个数组当做一个元素，放到stream中。
         */
        Stream.of(arr).forEach(s -> System.out.println(s));

    }
}
