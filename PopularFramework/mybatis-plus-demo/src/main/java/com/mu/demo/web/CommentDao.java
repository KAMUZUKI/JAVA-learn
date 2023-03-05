package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.domain.Comment;
import com.mu.demo.mapper.CommentMapper;
import com.mu.demo.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author : MUZUKI
 * @date : 2023-03-05 10:05
 **/

@RestController
@RequestMapping("/comment")
public class CommentDao {

    @Autowired(required = false)
    private CommentMapper commentMapper;

    /**
     * info.action?op=addComments
     * 添加评论
     */
    @RequestMapping(value = "/addComment")
    protected int addComment(HttpServletRequest request){
        Comment comment = HttpUtils.parseRequestToT(request, Comment.class);
        return commentMapper.insert(comment);
    }

    /**
     * info.action?op=getComments
     * 通过文章id获取文章评论
     */
    @RequestMapping(value = "/getComments")
    protected List<Comment> getComments(HttpServletRequest request){
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        QueryWrapper<Comment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("articleId", articleId);
        return commentMapper.selectList(null);
    }
}
