package com.example.mapper;

import com.example.bean.DUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user WHERE name LIKE CONCAT('%',#{username},'%') ORDER BY search_count LIMIT 0,4")
    public abstract List<DUser> selectLike(String username);
}
