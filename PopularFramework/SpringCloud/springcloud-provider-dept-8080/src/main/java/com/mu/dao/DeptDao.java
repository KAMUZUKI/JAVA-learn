package com.mu.dao;

import com.mu.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    boolean add(Dept dept);

    int delete(int id);

    List<Dept> queryList();
}
