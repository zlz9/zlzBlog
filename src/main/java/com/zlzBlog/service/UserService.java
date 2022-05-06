package com.zlzBlog.service;

import com.zlzBlog.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.LoginParams;

/**
* @author 23340
* @description 针对表【user】的数据库操作Service
* @createDate 2022-04-27 11:11:38
*/
public interface UserService extends IService<User> {

    Result login(LoginParams loginParams);
}
