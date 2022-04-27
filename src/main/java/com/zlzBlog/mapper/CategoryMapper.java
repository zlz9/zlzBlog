package com.zlzBlog.mapper;

import com.zlzBlog.pojo.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 23340
* @description 针对表【category】的数据库操作Mapper
* @createDate 2022-04-27 11:11:37
* @Entity com.zlzBlog.pojo.Category
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




