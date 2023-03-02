package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Comment;
import com.mu.demo.service.CommentService;
import com.mu.demo.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author MUZUKI
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2023-03-02 20:33:40
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




