package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.pojo.Category;
import com.zlzBlog.service.CategoryService;
import com.zlzBlog.mapper.CategoryMapper;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 23340
* @description 针对表【category】的数据库操作Service实现
* @createDate 2022-04-27 11:11:37
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{
@Autowired
CategoryMapper categoryMapper;
    @Override
    public Result getSummary() {
        List<Category> categories = categoryMapper.selectList(null);
        return Result.success(categories);
    }
}




