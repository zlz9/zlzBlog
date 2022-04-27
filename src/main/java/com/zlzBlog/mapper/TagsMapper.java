package com.zlzBlog.mapper;

import com.zlzBlog.pojo.Tags;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 23340
* @description 针对表【tags】的数据库操作Mapper
* @createDate 2022-04-27 11:11:38
* @Entity com.zlzBlog.pojo.Tags
*/
@Mapper
public interface TagsMapper extends BaseMapper<Tags> {

}




