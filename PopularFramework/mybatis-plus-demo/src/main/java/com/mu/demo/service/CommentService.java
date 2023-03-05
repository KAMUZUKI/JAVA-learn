package com.mu.demo.service;

import com.mu.demo.domain.Comment;
import com.mu.demo.web.model.JsonModel;

/**
* @author MUZUKI
* @description 针对表【comment】的数据库操作Service
* @createDate 2023-03-05 19:12:56
*/
public interface CommentService {
    /**
     * 添加评论
     * @param comment
     * @return 添加成功返回1，否则返回0
     */
    JsonModel addComment(Comment comment);

    /**
     * 通过文章id获取文章评论
     * @param articleId
     * @return 评论列表
     */
    JsonModel getComments(int articleId);
}
