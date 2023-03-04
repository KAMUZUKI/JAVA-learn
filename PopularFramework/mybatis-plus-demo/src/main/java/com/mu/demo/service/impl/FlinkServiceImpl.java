package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Flink;
import com.mu.demo.service.FlinkService;
import com.mu.demo.mapper.FlinkMapper;
import org.springframework.stereotype.Service;

/**
* @author MUZUKI
* @description 针对表【flink】的数据库操作Service实现
* @createDate 2023-03-02 20:33:40
*/
@Service
public class FlinkServiceImpl extends ServiceImpl<FlinkMapper, Flink>
    implements FlinkService{

    @Override
    public void addFlink(Flink flink) {

    }
}




