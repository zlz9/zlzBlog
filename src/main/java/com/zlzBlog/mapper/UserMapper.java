package com.zlzBlog.mapper;

import com.zlzBlog.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 23340
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-04-27 11:11:38
* @Entity com.zlzBlog.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




