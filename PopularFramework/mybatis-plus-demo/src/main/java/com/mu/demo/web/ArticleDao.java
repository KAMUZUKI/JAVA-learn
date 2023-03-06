package com.mu.demo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mu.demo.domain.Article;
import com.mu.demo.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author : MUZUKI
 * @date : 2023-03-04 17:09
 **/


@Repository
public class ArticleDao {

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    /**
     * 添加文章
     */
    public int addArticle(Article article){
        return articleMapper.insert(article);
    }

    /**
     * 删除文章
     */
    public int deleteArticle(int articleId) {
        return articleMapper.deleteById(articleId);
    }

    /**
     * 修改文章
     */
    public int alterArticle(Article article){
        return articleMapper.updateById(article);
    }

    /**
     * 获取所有文章
     */
    public List<Article> getAllArticle() {
        return articleMapper.selectList(null);
    }

    /**
     * 根据id获取文章
     */
    public Article getArticleById(int articleId) {
        QueryWrapper<Article> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", articleId);
        return articleMapper.selectOne(queryWrapper);
    }

    /**
     * 获取文章排行
     */
    public List<Article> getArticleTop() {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.select("id", "title", "content", "readcnt").orderByDesc("readcnt").last("limit 3");
        return articleMapper.selectList(wrapper);
    }

    /**
     * article.action?op=changeData
     * 用来存redis,用户给文章点赞->文章对应的点赞数+1,取消赞->文章的点赞数-1,用户点击文章->文章浏览量+1
     * redis:
     * 浏览量:键key->readCnt:值value->ArticleId_
     */
    public void changeData(String key, String value) {
        //TODO:
    }

    /**
     * 获取所有标签
     */
    public List<Article> getAllTags() {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.select("label");
        return articleMapper.selectList(wrapper);
    }

    /**
     * 根据分类获取文章
     */
    public List<Article> getArticleByCategory(int categoryId) {
        QueryWrapper<Article> wrapper = new QueryWrapper<>();
        wrapper.eq("categoryId", categoryId);
        return articleMapper.selectList(wrapper);
    }
}
