package com.mystream.demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/4/12
 * @description:
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        /**
         * collect(Collector collector)  收集流中的数据，放到集合中（List, Set, Map）
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-1","周芷若-女-2","赵敏-女-3","张强-男-4","张三丰-男-5","张翠山-男-6","张良-男-7","王二麻子-男-8","蔡徐坤-女-9","蔡徐坤-女-9");

        // 收集所有的男性放到List中
//        List<String> maleList = list.stream().filter(s -> s.split("-")[1].equals("男"))
//                .collect(Collectors.toList());
//        System.out.println(maleList);

        // 收集所有的女性放到Set中
//        Set<String> femaleList = list.stream().filter(s -> s.split("-")[1].equals("女"))
//                .collect(Collectors.toSet());
//        System.out.println(femaleList);

        // 收集男性到map中  key-姓名，value-序号
        Map<String, Integer> maleMap = list.stream().filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(maleMap);
    }
}
