package com.zlzBlog.mapper;

import com.zlzBlog.pojo.Articles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 23340
* @description 针对表【articles】的数据库操作Mapper
* @createDate 2022-04-27 11:11:37
* @Entity com.zlzBlog.pojo.Articles
*/
@Mapper
public interface ArticlesMapper extends BaseMapper<Articles> {

}




