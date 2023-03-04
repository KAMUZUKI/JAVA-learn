package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.domain.Article;
import com.mu.demo.mapper.ArticleMapper;
import com.mu.demo.utils.HttpUtils;
import com.mu.demo.web.model.JsonModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : MUZUKI
 * @date : 2023-03-04 17:09
 **/

@RestController
@RequestMapping("/article")
public class ArticleController {

    private Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    /**
     * article.action?op=deleteArticle
     * 删除文章
     */
    @RequestMapping(value = "/deleteArticle")
    protected void deleteArticle(int articleId) {
        articleMapper.deleteById(articleId);
        logger.info("Article " + articleId + "deleted successfully");
    }

    /**
     * article.action?op=alterArticle
     * 修改文章
     */
    @RequestMapping(value = "/alterArticle")
    protected void alterArticle(HttpServletRequest request){
            Article article = HttpUtils.parseRequestToT(request, Article.class);
            articleMapper.updateById(article);
            logger.info("Article updated successfully");
    }

    /**
     * info.action?op=getArticleById
     * 根据id获取文章
     */
    @RequestMapping(value = "/getArticleById")
    protected Article getArticleById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int articleId = Integer.parseInt(request.getParameter("id"));
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        Wrapper wrapper = queryWrapper.eq("id", articleId);
        Article article = articleMapper.selectOne(wrapper);
//        JsonModel jsonModel = new JsonModel();
//        jsonModel.setData(article);
//        jsonModel.setCode(200);
//        HttpUtils.writeJson(jsonModel, response);
        logger.info("Article {} get successfully",articleId);
        return article;
    }

    /**
     * article.action?op=changeData
     * 用来存redis,用户给文章点赞->文章对应的点赞数+1,取消赞->文章的点赞数-1,用户点击文章->文章浏览量+1
     * redis:
     * 浏览量:键key->readCnt:值value->ArticleId_
     */
    protected void changeData(String key, String value) {
        //TODO:
    }
}
