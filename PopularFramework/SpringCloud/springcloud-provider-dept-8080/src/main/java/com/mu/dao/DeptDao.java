package com.mu.dao;

import com.mu.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MUZUKI
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean add(Dept dept);

    public Dept get(int id);

    public List<Dept> queryList();
}
