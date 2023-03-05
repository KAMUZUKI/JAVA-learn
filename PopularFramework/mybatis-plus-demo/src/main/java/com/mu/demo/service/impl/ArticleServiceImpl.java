package com.mu.demo.service.impl;

import com.mu.demo.domain.Article;
import com.mu.demo.service.ArticleService;
import com.mu.demo.utils.HttpUtils;
import com.mu.demo.web.ArticleDao;
import com.mu.demo.web.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/

@RestController
@RequestMapping("/article")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleDao articleDao;

    private JsonModel jm = new JsonModel();

    @Override
    @RequestMapping(value = "/addArticle")
    public JsonModel addArticle(HttpServletRequest request) {
        Article article = HttpUtils.parseRequestToT(request, Article.class);
        jm.setCode(articleDao.addArticle(article));
        return jm;
    }

    @Override
    @RequestMapping(value = "/deleteArticle")
    public JsonModel deleteArticle(HttpServletRequest request) {
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        jm.setCode(articleDao.deleteArticle(articleId));
        return jm;
    }

    @Override
    @RequestMapping(value = "/alterArticle")
    public JsonModel alterArticle(HttpServletRequest request) {
        Article article = HttpUtils.parseRequestToT(request, Article.class);
        jm.setCode(articleDao.alterArticle(article));
        return jm;
    }

    @Override
    @RequestMapping(value = "/getAllArticle")
    public JsonModel getAllArticle() {
        jm.setData(articleDao.getAllArticle());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getArticleById")
    public JsonModel getArticleById(HttpServletRequest request) {
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        jm.setData(articleDao.getArticleById(articleId));
        return jm;
    }

    @Override
    @RequestMapping(value = "/getArticleTop")
    public JsonModel getArticleTop() {
        jm.setData(articleDao.getArticleTop());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getAllTags")
    public JsonModel getAllTags() {
        jm.setData(articleDao.getAllTags());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getByCategory")
    public JsonModel getArticleByCategory(HttpServletRequest request) {
        String category = request.getParameter("category");
        jm.setData(articleDao.getArticleByCategory(category));
        return jm;
    }
}




