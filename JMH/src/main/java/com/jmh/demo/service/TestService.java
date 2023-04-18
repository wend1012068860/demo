package com.jmh.demo.service;

import org.springframework.stereotype.Service;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/3/10
 * @description:
 */
@Service
public class TestService {

    public void print(){
//        System.out.println("打印测试......");
        int count=0;
        for (int i=0; i<1000; i++){
            count += i;
        }
    }
}
