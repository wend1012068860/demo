package com.example.mybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis_plus.entity.User;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/6
 * @description:
 */
public interface UserMapper extends BaseMapper<User> {
    //���е�CRUD���Ѿ����
    //����Ҫ����ǰһ������һ����ļ���pojo-dao������mybatis������mapper.xml�ļ���==>service-controlle
}
