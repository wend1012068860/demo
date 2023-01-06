package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis_plus.MybatisPlusApplication;
import com.example.mybatis_plus.entity.User;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Wrapper;
import java.util.List;

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
     * 查询
     */
    @Test
    public void selectTest(){

        // 查询全部用户，参数是一个Wrapper，条件构造器，先不使用为null
        // UserMapper中的selectList()方法的参数为MP内置的条件封装器Wrapper，所以不填写就是无任何条件
//        List<User> userList = userMapper.selectList(null);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "Jone");
        wrapper.eq("age", 18);
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList.toString());

    }

    /**
     * 新增
     */
    @Test
    public void insertTest(){
        User user = new User();
        user.setName("李四");
        user.setAge(22);
        user.setEmail("lisi@qq.com");

        int insert = userMapper.insert(user);//如果没有设置id，那么会自动生成id
        System.out.println(insert);//受影响行数
        System.out.println(user);//id会自动回填

    }

    /**
     * 更新
     */
    @Test
    public void updateTest(){
        User user = new User();
        user.setId(2L);
        user.setEmail("44@qq.com");
        int result = userMapper.updateById(user);
        System.out.println(result);
        System.out.println(userMapper.selectById(2L));
    }


}