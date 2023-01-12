# mapstruct

官网：https://mapstruct.org/

使用指南：https://mapstruct.org/documentation/stable/reference/html/

## 一、使用场景

![image-20230112204400784](E:\code\my_code\demo\mapstruct\src\main\java\com\wmq\mapstruct\pic\1.1.png)

![image-20230112204626752](E:\code\my_code\demo\mapstruct\src\main\java\com\wmq\mapstruct\pic\1.2.png)

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

## 三、@Mapper

- 默认映射规则：
  - 同类型且同名的属性，自动映射。
- 自动类型转换：
  - 8种基本类型和包装类之间
  - 8种进本类型（包括包装类）和String类型之间
  - 日期类型和String类型之间

## 四、@Mappings和@Mapping

- 指定属性之间的映射关系
  - 数字格式化：numberFormat = "#.00"
  - 日期格式化：dateFormat = "yyyy-MM-dd HH:mm:ss"
- ignore
- 属性是引用对象的映射处理
- 批量映射

## 五、@AfterMapping和@MappingTarget

- 再映射最后一步对属性进行自定义映射处理

