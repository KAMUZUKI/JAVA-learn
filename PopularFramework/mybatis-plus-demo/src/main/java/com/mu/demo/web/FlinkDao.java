package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.domain.Flink;
import com.mu.demo.mapper.FlinkMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author MUZUKI
 * @Classname FlinkController
 * @Description TODO
 * @Date 2023/3/3 19:36
 */
@RestController
@RequestMapping("/flink")
public class FlinkDao {

    private Logger logger = LoggerFactory.getLogger(FlinkDao.class);

    @Autowired(required = false)
    private FlinkMapper flinkMapper;

    /**
     * 添加友链
     * @param flink
     */
    @RequestMapping(value = "/addFlink")
    protected void addFlink(Flink flink){
        flinkMapper.insert(flink);
        logger.info("添加友链成功");
    }

    /**
     * 获取所有开启的友情链接
     */
    @RequestMapping(value = "/getFlink")
    protected List<Flink> getFlink(){
        QueryWrapper<Flink> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("status", 1);
        return flinkMapper.selectList(queryWrapper);
    }

    /**
     * 删除友链
     */
    @RequestMapping(value = "/deleteFlinkById")
    protected int deleteFlinkById(int id){
        return flinkMapper.deleteById(id);
    }

    /**
     * 修改密码
     */
    protected void alterPassword(String oldPassword, String newPassword, String confirmPassword){}
}
