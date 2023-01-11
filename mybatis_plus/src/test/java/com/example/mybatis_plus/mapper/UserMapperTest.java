package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis_plus.MybatisPlusApplication;
import com.example.mybatis_plus.entity.User;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Wrapper;
import java.util.*;

import static org.junit.Assert.*;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/6
 * @description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisPlusApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 新增
     */
    @Test
    public void insertTest(){
        User user = new User();
        user.setName("赵四");
        user.setAge(25);
        user.setEmail("wangwu@qq.com");

        int insert = userMapper.insert(user);//如果没有设置id，那么会自动生成id
        System.out.println(insert);//受影响行数
        System.out.println(user);//id会自动回填

    }

    /**
     * 根据id删除
     */
    public void deleteById(){
        userMapper.deleteById(4L);
    }

    /**
     * 根据id更新
     */
    @Test
    public void updateByIdTest(){
        User user = new User();
        user.setId(2L);
        user.setEmail("44@qq.com");
        int result = userMapper.updateById(user);
        System.out.println(result);
        System.out.println(userMapper.selectById(2L));
    }

    /**
     * 查询全部
     */
    @Test
    public void selectAllTest(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    /**
     * 根据id查询
     */
    @Test
    public void selectByIdTest(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    /**
     * 分页查询
     */
    @Test
    public void selectPageTest(){
        IPage page = new Page(1,2);
        userMapper.selectPage(page,null);
        System.out.println("当前页码：" + page.getCurrent());
        System.out.println("每页大小：" + page.getSize());
        System.out.println("总页码数：" + page.getPages());
        System.out.println("总条数：" + page.getTotal());
        System.out.println("数据：" + page.getRecords());
    }

    /**
     * 条件查询
     */
    @Test
    public void selectTest(){
        //方式一：按条件查询
//        QueryWrapper wrapper = new QueryWrapper<>();
//        wrapper.lt("age",18);
//        List<User> users = userMapper.selectList(wrapper);
//        System.out.println(users);

        //方式二：lambda按条件查询
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.lambda().lt(User::getAge,22);
//        List<User> users = userMapper.selectList(wrapper);
//        System.out.println(users);

        //方式三：lambda按条件查询
//        LambdaQueryWrapper<User> lwq = new LambdaQueryWrapper<>();
//        lwq.lt(User::getAge,22);
//        List<User> users = userMapper.selectList(lwq);
//        System.out.println(users);

//        LambdaQueryWrapper<User> lwq = new LambdaQueryWrapper<>();
        // 21-22岁
//        lwq.lt(User::getAge,22);
//        lwq.gt(User::getAge,21);
        // 链式写法
//        lwq.lt(User::getAge,22).gt(User::getAge,21);
        // 小于21 或 大于22
//        lwq.lt(User::getAge,21).or().gt(User::getAge,22);
//        List<User> users = userMapper.selectList(lwq);
//        System.out.println(users);

        //查询投影
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        wrapper.select(User::getName, User::getEmail);
//        List<User> userList = userMapper.selectList(wrapper);
//        System.out.println(userList);

//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.select("count(*) as count, age");
//        wrapper.groupBy("age");
//        List<Map<String, Object>> userList = userMapper.selectMaps(wrapper);
//        System.out.println(userList);

        //各种条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        // 等于 eq
//        lqw.eq(User::getName, "张三");
//        User user = userMapper.selectOne(lqw);
//        System.out.println(user);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        //范围查询 lt le gt ge between
//        lqw.between(User::getAge, 21,25);
//        List<User> users = userMapper.selectList(lqw);
//        System.out.println(users);

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //模糊查询 like
        lqw.like(User::getName, "李");
        List<User> users = userMapper.selectList(lqw);
        System.out.println(users);

    }

    /**
     * 逻辑删除测试
     */
    @Test
    public void logicDeleteTest(){
        userMapper.deleteById(1L);
    }


}