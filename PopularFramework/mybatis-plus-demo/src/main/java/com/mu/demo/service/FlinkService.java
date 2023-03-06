package com.mu.demo.service;

import com.mu.demo.web.model.JsonModel;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【flink】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface FlinkService{
    /**
     * 添加友链
     * @param request 请求
     * @return 添加结果
     */
    JsonModel addFlink(HttpServletRequest request);

    /**
     * 获取所有开启的友情链接
     * @return 友链列表
     */
    JsonModel getFlink();

    /**
     * 删除友链
     * @param request 请求
     * @return 删除结果
     */
    JsonModel deleteFlinkById(HttpServletRequest request);

    /**
     * 修改密码
     * @param request 请求
     * @return 修改结果
     */
//    JsonModel alterPassword(HttpServletRequest request);
}
