package com.mu.demo.web;

import com.mu.demo.domain.Flink;
import com.mu.demo.service.FlinkService;
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

    @Autowired
    private FlinkService flinkService;

    @RequestMapping(value = "/addFlink")
    protected void addFlink(HttpServletRequest request, HttpServletResponse response) {
        String flink = request.getParameter("flink");
        flinkService.addFlink(null);
    }
}
