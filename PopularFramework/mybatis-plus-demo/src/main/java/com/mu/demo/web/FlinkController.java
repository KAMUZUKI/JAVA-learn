package com.mu.demo.web;

import com.mu.demo.domain.Flink;
import com.mu.demo.mapper.FlinkMapper;
import com.mu.demo.utils.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author MUZUKI
 * @Classname FlinkController
 * @Description TODO
 * @Date 2023/3/3 19:36
 */
@RestController
@RequestMapping("/flink")
public class FlinkController {

    private Logger logger = LoggerFactory.getLogger(FlinkController.class);

    @Autowired(required = false)
    private FlinkMapper flinkMapper;

    @RequestMapping(value = "/addFlink")
    protected void addFlink(HttpServletRequest request, HttpServletResponse response){
        Flink flink = HttpUtils.parseRequestToT(request, Flink.class);
        flinkMapper.insert(flink);
        logger.info("添加友链成功");
    }
}
