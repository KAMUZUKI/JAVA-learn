package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Comment;
import com.mu.demo.mapper.CommentMapper;
import com.mu.demo.service.CommentService;
import com.mu.demo.web.model.JsonModel;
import org.springframework.stereotype.Service;

/**
* @author MUZUKI
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@Service
public class CommentServiceImpl implements CommentService {

    @Override
    public JsonModel addComment(Comment comment) {
        return null;
    }

    @Override
    public JsonModel getComments(int articleId) {
        return null;
    }
}




