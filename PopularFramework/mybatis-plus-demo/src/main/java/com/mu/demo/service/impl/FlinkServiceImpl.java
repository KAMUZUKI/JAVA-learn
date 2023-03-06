package com.mu.demo.service.impl;

import com.mu.demo.domain.Flink;
import com.mu.demo.service.FlinkService;
import com.mu.demo.utils.HttpUtils;
import com.mu.demo.web.FlinkDao;
import com.mu.demo.web.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【flink】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@RestController
@RequestMapping("/flink")
public class FlinkServiceImpl implements FlinkService {

    @Autowired
    private FlinkDao flinkDao;

    private JsonModel jm = new JsonModel();

    @Override
    @RequestMapping(value = "/addFlink")
    public JsonModel addFlink(HttpServletRequest request) {
        Flink flink = HttpUtils.parseRequestToT(request,Flink.class);
        jm.setCode(flinkDao.addFlink(flink));
        return jm;
    }

    @Override
    @RequestMapping(value = "/getFlink")
    public JsonModel getFlink() {
        jm.setCode(1).setData(flinkDao.getFlink());
        return jm;
    }

    @Override
    @RequestMapping(value = "/deleteFlinkById")
    public JsonModel deleteFlinkById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        jm.setCode(1).setData(flinkDao.deleteFlinkById(id));
        return jm;
    }

//    @Override
//    public JsonModel alterPassword(HttpServletRequest request) {
//        String oldPassword, String newPassword, String confirmPassword
//        return null;
//    }
}




