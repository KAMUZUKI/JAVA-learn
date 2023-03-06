package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Comment;
import com.mu.demo.mapper.CommentMapper;
import com.mu.demo.service.CommentService;
import com.mu.demo.utils.HttpUtils;
import com.mu.demo.web.CommentDao;
import com.mu.demo.web.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@RestController
@RequestMapping("/comment")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    private JsonModel jm = new JsonModel();

    @Override
    @RequestMapping(value = "/addComment")
    public JsonModel addComment(HttpServletRequest request) {
        Comment comment = HttpUtils.parseRequestToT(request, Comment.class);
        jm.setCode(1).setData(commentDao.addComment(comment));
        return jm;
    }

    @Override
    @RequestMapping(value = "/getComments")
    public JsonModel getComments(HttpServletRequest request) {
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        jm.setCode(1).setData(commentDao.getComments(articleId));
        return jm;
    }
}




