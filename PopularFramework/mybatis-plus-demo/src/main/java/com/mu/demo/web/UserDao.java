package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.mapper.UserMapper;
import com.mu.demo.domain.User;
import com.mu.demo.utils.Constants;
import com.mu.demo.utils.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : MUZUKI
 * @date : 2023-03-02 19:18
 **/

@RestController
@RequestMapping("/user")
public class UserDao {

    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping(value = "/getAllUser")
    protected List<Map<String, Object>> getAllUser() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id", "username", "account", "phone", "email", "status", "createTime");
        List<Map<String, Object>> userMap = userMapper.selectMaps(queryWrapper);
        return userMap;
    }

    /**
     * 获取用户喜欢的文章列表
     */
    @RequestMapping(value = "/getLikeList")
    protected List<Integer> getLikeList(Integer id) {
        //获取从前台传过来的用户id
        Jedis jedis = JedisUtils.getReadisInstance();
        List<Integer> likeList=new ArrayList<Integer>();
        if (!jedis.exists(id + Constants.REDIS_USER_PRAISE)) {
            likeList = null;
        } else {
            Set<String> set = jedis.smembers(id + Constants.REDIS_USER_PRAISE);
            if (set.size() > 0) {
                for (String str : set) {
                    likeList.add(Integer.parseInt(str));
                }
            }
        }
        return likeList;
    }
}
