package com.mu.demo.service;

import com.mu.demo.domain.Comment;
import com.mu.demo.web.model.JsonModel;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【comment】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface CommentService {
    /**
     * 添加评论
     * @param request 请求
     * @return 添加成功返回1，否则返回0
     */
    JsonModel addComment(HttpServletRequest request);

    /**
     * 通过文章id获取文章评论
     * @param request 请求
     * @return 评论列表
     */
    JsonModel getComments(HttpServletRequest request);
}
