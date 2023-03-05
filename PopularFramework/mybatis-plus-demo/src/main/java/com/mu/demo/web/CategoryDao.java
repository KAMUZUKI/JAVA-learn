package com.mu.demo.web;

import com.mu.demo.domain.Category;
import com.mu.demo.mapper.CategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author : MUZUKI
 * @date : 2023-03-05 09:49
 **/

@Repository
public class CategoryDao {

    private static Logger logger = LoggerFactory.getLogger(CategoryDao.class);

    @Autowired(required = false)
    private CategoryMapper categoryMapper;

    /**
     * 获取所有分类
     */
    public List<Category> getCategory(){
        return categoryMapper.selectList(null);
    }

    /**
     * 添加分类
     */
    public int addCategory(Category category){
        return categoryMapper.insert(category);
    }

    /**
     * 删除分类
     */
    public int deleteCategory(int categoryId){
        return categoryMapper.deleteById(categoryId);
    }
}
