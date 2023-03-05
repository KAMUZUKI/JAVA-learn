package com.mu.demo.service;

import com.mu.demo.domain.Flink;
import com.mu.demo.web.model.JsonModel;

/**
* @author MUZUKI
* @description 针对表【flink】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface FlinkService{
    /**
     * 添加友链
     * @param flink 友链
     * @return 添加结果
     */
    JsonModel addFlink(Flink flink);

    /**
     * 获取所有开启的友情链接
     * @return 友链列表
     */
    JsonModel getFlink();

    /**
     * 删除友链
     * @param id 友链id
     * @return 删除结果
     */
    JsonModel deleteFlinkById(int id);

    /**
     * 修改密码
     * @param oldPassword 旧密码
     * @param newPassword  新密码
     * @param confirmPassword 确认密码
     * @return 修改结果
     */
    JsonModel alterPassword(String oldPassword, String newPassword, String confirmPassword);
}
