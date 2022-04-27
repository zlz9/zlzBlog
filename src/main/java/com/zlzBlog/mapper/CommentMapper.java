package com.zlzBlog.mapper;

import com.zlzBlog.pojo.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 23340
* @description 针对表【comment】的数据库操作Mapper
* @createDate 2022-04-16 17:56:56
* @Entity com.zlzBlog.pojo.Comment
*/
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}




