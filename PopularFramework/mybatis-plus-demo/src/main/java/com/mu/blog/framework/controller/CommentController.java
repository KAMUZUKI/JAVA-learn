package com.mu.blog.framework.controller;

import com.mu.blog.framework.domain.Comment;
import com.mu.blog.framework.service.impl.CommentServiceImpl;
import com.mu.blog.framework.utils.HttpUtils;
import com.mu.blog.framework.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author MUZUKI
 * @Classname Comment
 * @Description TODO
 * @Date 2023/3/26 1:57
 */

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentServiceImpl commentService;

    @RequestMapping(value = "/addComment")
    public JsonModel addComment(HttpServletRequest request) {
        Comment comment = HttpUtils.parseRequestToT(request, Comment.class);
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(commentService.addComment(comment));
        return jm;
    }

    @RequestMapping(value = "/getComments")
    public JsonModel getComments(HttpServletRequest request) {
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(commentService.getComments(articleId));
        return jm;
    }
}
