package com.mu.demo.service;

import com.mu.demo.web.model.JsonModel;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【article】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface ArticleService {
    /**
     * 添加文章
     * @param request 请求
     * @return 添加结果
     */
    JsonModel addArticle(HttpServletRequest request);

    /**
     * 删除文章
     * @param request 请求
     * @return 删除结果
     */
    JsonModel deleteArticle(HttpServletRequest request);

    /**
     * 修改文章
     * @param request 请求
     * @return 修改结果
     */
    JsonModel alterArticle(HttpServletRequest request);

    /**
     * 获取所有文章
     * @return 文章列表
     */
    JsonModel getAllArticle();

    /**
     * 根据id获取文章
     * @param request 请求
     * @return 文章
     */
    JsonModel getArticleById(HttpServletRequest request);

    /**
     * 获取文章排行
     * @return 文章排行列表
     */
    JsonModel getArticleTop();

    /**
     * 获取所有标签
     * @return 标签列表
     */
    JsonModel getAllTags();

    /**
     * 根据分类获取文章
     * @param request 请求
     * @return 文章列表
     */
    JsonModel getArticleByCategory(HttpServletRequest request);

    /**
     * 根据标签获取文章更新点赞
     * @param request 请求
     * @return 操作结果
     */
    JsonModel changeData(HttpServletRequest request);
}
