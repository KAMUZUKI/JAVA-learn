package com.mu.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mu.demo.domain.Category;
import com.mu.demo.service.CategoryService;
import com.mu.demo.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author MUZUKI
* @description 针对表【category】的数据库操作Service实现
* @createDate 2023-03-02 20:33:40
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




