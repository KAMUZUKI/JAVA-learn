package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Flink;
import com.mu.demo.mapper.FlinkMapper;
import com.mu.demo.service.FlinkService;
import com.mu.demo.web.model.JsonModel;
import org.springframework.stereotype.Service;

/**
* @author MUZUKI
* @description 针对表【flink】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@Service
public class FlinkServiceImpl implements FlinkService {

    @Override
    public JsonModel addFlink(Flink flink) {
        return null;
    }

    @Override
    public JsonModel getFlink() {
        return null;
    }

    @Override
    public JsonModel deleteFlinkById(int id) {
        return null;
    }

    @Override
    public JsonModel alterPassword(String oldPassword, String newPassword, String confirmPassword) {
        return null;
    }
}




