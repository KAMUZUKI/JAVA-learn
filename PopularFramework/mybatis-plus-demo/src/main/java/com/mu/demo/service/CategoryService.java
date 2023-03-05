package com.mu.demo.service;

import com.mu.demo.domain.Category;
import com.mu.demo.web.model.JsonModel;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【category】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface CategoryService {
    /**
     * 获取所有分类
     * @return JsonModel
     */
    JsonModel getCategory();

    /**
     * 添加分类
     * @param request 请求
     * @return JsonModel
     */
    JsonModel addCategory(HttpServletRequest request);

    /**
     * 删除分类
     * @param  request 请求
     * @return JsonModel
     */
    JsonModel deleteCategory(HttpServletRequest request);

}
