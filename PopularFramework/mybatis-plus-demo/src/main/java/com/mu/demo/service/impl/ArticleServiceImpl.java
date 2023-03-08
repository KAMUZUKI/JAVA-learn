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

    @Override
    @RequestMapping(value = "/addArticle")
    public JsonModel addArticle(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        Article article = HttpUtils.parseRequestToT(request, Article.class);
        try {
            jm.setCode(articleDao.addArticle(article));
        }catch (Exception e){
            jm.setCode(0);
            jm.setMsg("添加文章失败");
        }
        return jm;
    }

    @Override
    @RequestMapping(value = "/deleteArticle")
    public JsonModel deleteArticle(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        jm.setCode(articleDao.deleteArticle(articleId));
        return jm;
    }

    @Override
    @RequestMapping(value = "/alterArticle")
    public JsonModel alterArticle(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        Article article = HttpUtils.parseRequestToT(request, Article.class);
        jm.setCode(articleDao.alterArticle(article));
        return jm;
    }

    @Override
    @RequestMapping(value = "/getAllArticle")
    public JsonModel getAllArticle() {
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(articleDao.getAllArticle());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getArticleById")
    public JsonModel getArticleById(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        int articleId = Integer.parseInt(request.getParameter("articleId"));
        jm.setCode(1).setData(articleDao.getArticleById(articleId));
        return jm;
    }

    @Override
    @RequestMapping(value = "/getArticleTop")
    public JsonModel getArticleTop() {
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(articleDao.getArticleTop());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getAllTags")
    public JsonModel getAllTags() {
        JsonModel jm = new JsonModel();
        jm.setCode(1).setData(articleDao.getAllTags());
        return jm;
    }

    @Override
    @RequestMapping(value = "/getByCategory")
    public JsonModel getArticleByCategory(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        jm.setCode(1).setData(articleDao.getArticleByCategory(categoryId));
        return jm;
    }

    @Override
    @RequestMapping(value = "/changeData")
    public JsonModel changeData(HttpServletRequest request) {
        JsonModel jm = new JsonModel();
        String articleId = request.getParameter("articleId");
        String userId = request.getParameter("userId");
        if(articleDao.changeData(articleId,userId)){
            jm.setCode(1).setMsg("点赞成功");
        }else {
            jm.setCode(0).setMsg("点赞失败 等待检测网络重试");
        }
        return jm;
    }
}




