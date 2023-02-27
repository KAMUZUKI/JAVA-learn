package com.mu.mapper;

import com.mu.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author : MUZUKI
 * @date : 2022-12-16 10:42
 * @Description :UserMapper
 **/

/**
 * 用户mapper接口
 * @author MUZUKI
 */
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param username
     * @return User
     */
    User getUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户是否存在
     * 使用默认Param1,Param2
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);

    /**
     * 根据用户名和密码查询用户是否存在
     * 使用Parma注解
     * @param username
     * @param password
     * @return
     */
    User checkLoginParam(@Param("username") String username,@Param("password") String password);

    /**
     * 添加用户
     * @param user
     * @return int插入是否成功
     */
    int addUser(User user);
}
