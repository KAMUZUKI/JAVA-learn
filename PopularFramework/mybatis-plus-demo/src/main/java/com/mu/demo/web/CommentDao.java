package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.domain.Comment;
import com.mu.demo.mapper.CommentMapper;
import com.mu.demo.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author : MUZUKI
 * @date : 2023-03-05 10:05
 **/

@Repository
public class CommentDao {

    @Autowired(required = false)
    private CommentMapper commentMapper;

    /**
     * 添加评论
     */
    public int addComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    /**
     * 通过文章id获取文章评论
     */
    public List<Comment> getComments(int articleId){
        QueryWrapper<Comment> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("article_id", articleId);
        return commentMapper.selectList(queryWrapper);
    }
}
