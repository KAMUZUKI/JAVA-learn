package com.mu.demo.service.impl;

import com.mu.demo.domain.Category;
import com.mu.demo.service.CategoryService;
import com.mu.demo.utils.HttpUtils;
import com.mu.demo.web.CategoryDao;
import com.mu.demo.web.model.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
* @author MUZUKI
* @description 针对表【category】的数据库操作Service实现
* @createDate 2023-03-05 19:20:49
*/
@RestController
@RequestMapping("/category")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

    private JsonModel jm = new JsonModel();

    @Override
    @PostMapping(value = "/getCategory")
    public JsonModel getCategory() {
        jm.setData(categoryDao.getCategory());
        return jm;
    }

    @Override
    @RequestMapping(value = "/addCategory")
    public JsonModel addCategory(HttpServletRequest request) {
        Category category = HttpUtils.parseRequestToT(request, Category.class);
        jm.setCode(categoryDao.addCategory(category));
        return jm;
    }

    @Override
    @RequestMapping(value = "/deleteCategory")
    public JsonModel deleteCategory(HttpServletRequest request) {
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        jm.setCode(categoryDao.deleteCategory(categoryId));
        return jm;
    }
}




