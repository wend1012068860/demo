# mapstruct

官网：https://mapstruct.org/

使用指南：https://mapstruct.org/documentation/stable/reference/html/

## 一、浅析VO、DTO、DO、PO、POJO区别

VO（Value Object）值对象

DTO（Data Transfer Object）数据传输对象

BO(business object) 业务对象

PO（Persistent Object）持久化对象

DO（Domain Object）领域对象

DAO(data access object) 数据访问对象

POJO(plain ordinary java object) 简单无规则 java 对象

https://blog.csdn.net/JokerLJG/article/details/119656022

## 二、引入依赖

```
	<properties>
        <java.version>8</java.version>
        <org.mapstruct.version>1.5.2.Final</org.mapstruct.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${org.mapstruct.version}</version>
        </dependency>
    </dependencies>
```

## 三、
