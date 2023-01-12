package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis_plus.entity.User;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/6
 * @description:
 */
public interface UserDao extends BaseMapper<User> {
    //所有的CRUD都已经完成
    //不需要像以前一样配置一大堆文件：pojo-dao（连接mybatis，配置mapper.xml文件）==>service-controlle
}
