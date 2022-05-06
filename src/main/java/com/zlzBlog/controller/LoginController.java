package com.zlzBlog.controller;

import com.zlzBlog.service.UserService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {
    @Autowired
    UserService userService;
   @RequestMapping("login")
    public Result login(@RequestBody LoginParams loginParams){
       return userService.login(loginParams);
   }
}
