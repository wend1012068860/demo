# MybatisPlus

## 一、MybatisPlus特性

- **无侵入**：只做增强不做改变，引入它不会对现有工程产生影响，如丝般顺滑
- **损耗小**：启动即会自动注入基本 CURD，性能基本无损耗，直接面向对象操作
- **强大的 CRUD 操作**：内置通用 Mapper、通用 Service，仅仅通过少量配置即可实现单表大部分 CRUD 操作，更有强大的条件构造器，满足各类使用需求
- **支持 Lambda 形式调用**：通过 Lambda 表达式，方便的编写各类查询条件，无需再担心字段写错
- **支持主键自动生成**：支持多达 4 种主键策略（内含分布式唯一 ID 生成器 - Sequence），可自由配置，完美解决主键问题
- **支持 ActiveRecord 模式**：支持 ActiveRecord 形式调用，实体类只需继承 Model 类即可进行强大的 CRUD 操作
- **支持自定义全局通用操作**：支持全局通用方法注入（ Write once, use anywhere ）
- **内置代码生成器**：采用代码或者 Maven 插件可快速生成 Mapper 、 Model 、 Service 、 Controller 层代码，支持模板引擎，更有超多自定义配置等您来使用
- **内置分页插件**：基于 MyBatis 物理分页，开发者无需关心具体操作，配置好插件之后，写分页等同于普通 List 查询
- **分页插件支持多种数据库**：支持 MySQL、MariaDB、Oracle、DB2、H2、HSQL、SQLite、Postgre、SQLServer 等多种数据库
- **内置性能分析插件**：可输出 SQL 语句以及其执行时间，建议开发测试时启用该功能，能快速揪出慢查询
- **内置全局拦截插件**：提供全表 delete 、 update 操作智能分析阻断，也可自定义拦截规则，预防误操作

## 二、添加依赖

```
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.5.1</version>
    </dependency>
```

注意：尽量不要同时导入mybatis和mybatis_plus，版本差异 (没试会有什么坑)

## 三、配置日志

所有的SQL都是不可见的，所以在后台是希望看到SQL是怎么执行的，就必须要配置日志。

```
#配置日志
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
```

## 四、CRUD测试

见代码。

条件构造器：https://baomidou.com/pages/10c804/#abstractwrapper

## 五、映射兼容性

1、实体类字段和数据库字段不对应![image-20230111210224867](../mybatis_plus/pic/5.1.png)

2、实体类中有，数据库没有

![image-20230111210634949](../mybatis_plus/pic/5.2.png)

3、不参与查询的字段，如password

![image-20230111211341710](../mybatis_plus/pic/5.3.png)

4、表明映射

![image-20230111211508880](../mybatis_plus/pic/5.4.png)

## 六、id生成策略

![image-20230111211743955](../mybatis_plus/pic/6.1.png)

## 七、逻辑删除

![image-20230111214417714](../mybatis_plus/pic/7.1.png)

注：默认值别忘了

![image-20230111214509700](../mybatis_plus/pic/7.2.png)

![image-20230111214518425](../mybatis_plus/pic/7.3.png)

## 八、乐观锁

![image-20230112093341124](../mybatis_plus/pic/8.1.png)

![image-20230112093552525](../mybatis_plus/pic/8.2.png)

![image-20230112093631965](../mybatis_plus/pic/8.3.png)

![image-20230112093713329](../mybatis_plus/pic/8.4.png)

## 九、代码生成器

![image-20230112101319418](../mybatis_plus/pic/9.1.png)

![image-20230112101343158](../mybatis_plus/pic/9.2.png)

![image-20230112101424322](../mybatis_plus/pic/9.3.png)

![image-20230112101455636](../mybatis_plus/pic/9.4.png)

![image-20230112101515834](../mybatis_plus/pic/9.5.png)

![image-20230112101537686](../mybatis_plus/pic/9.6.png)
