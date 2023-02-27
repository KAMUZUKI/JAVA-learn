package com.mu.mapper;

import com.mu.pojo.User;
import com.mu.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : MUZUKI
 * @date : 2022-12-16 11:35
 **/

public class UserMapperTest {
    @Test
    public void getUserByUsername() throws IOException {
        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserByUsername("admin");
        System.out.println(user);
    }

    /**
     * 使用默认Parma1,Param2
     * @throws IOException
     */
    @Test
    public void checkLogin() throws IOException {
        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.checkLogin("admin","123456");
        System.out.println(user);
    }

    /**
     * 使用Parma注解 (常用)
     * @throws IOException
     */
    @Test
    public void checkLoginParam() throws IOException {
        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.checkLogin("admin","123456");
        System.out.println(user);
    }

    /**
     * 添加用户
     *
     */
    @Test
    public void addUser() throws IOException {
        SqlSession session = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        int res = userMapper.addUser(new User("test2","123456"));
        System.out.println(res);
    }
}
