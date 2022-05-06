package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.pojo.User;
import com.zlzBlog.service.UserService;
import com.zlzBlog.mapper.UserMapper;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 23340
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-27 11:11:38
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
@Autowired
UserMapper userMapper;
    @Override
    public Result login(LoginParams loginParams) {
        return null;
    }
}




