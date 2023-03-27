package com.mu.demo.framework.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.framework.domain.User;
import com.mu.demo.framework.mapper.UserMapper;
import com.mu.demo.framework.utils.JedisUtils;
import com.mu.demo.framework.utils.Md5;
import com.mu.demo.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MUZUKI
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2023-03-05 19:20:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 用户登录
     *
     * @param account 用户信息
     * @return 用户信息
     */
    public User login(String account, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        String md5_pwd = Md5.getInstance().getMD5(password);
        queryWrapper.eq("account", account);
        queryWrapper.eq("pwd", md5_pwd);
        return userMapper.selectOne(queryWrapper);
    }

    /**
     * 用户注册
     *
     * @param user 用户信息
     * @return 用户信息
     */
    public int register(User user) {
        return userMapper.insert(user);
    }

    /**
     * 获取全部用户
     *
     * @return 用户集合
     */
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    /**
     * 通过id修改用户
     */
    public int updateUserById(User user) {
        return userMapper.updateById(user);
    }

    /**
     * 获取用户喜欢的文章列表
     *
     * @param id 用户id
     * @return 文章id集合
     */
    public List<Integer> getLikeList(int id) {
        //获取从前台传过来的用户id
        Jedis jedis = JedisUtils.getInstance();
        List<Integer> likeList = new ArrayList<Integer>();
        likeList.add(10);
//        if (!jedis.exists(id + Constants.REDIS_USER_PRAISE)) {
//            likeList = null;
//        } else {
//            Set<String> set = jedis.smembers(id + Constants.REDIS_USER_PRAISE);
//            if (set.size() > 0) {
//                for (String str : set) {
//                    likeList.add(Integer.parseInt(str));
//                }
//            }
//        }
        return likeList;
    }
}




