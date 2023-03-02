package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Article;
import com.mu.demo.service.ArticleService;
import com.mu.demo.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author MUZUKI
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-03-02 20:33:40
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




