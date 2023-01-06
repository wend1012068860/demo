package com.example.mybatis_plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/6
 * @description:
 */

@SpringBootApplication
@MapperScan("com.example.mybatis_plus.mapper")
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
