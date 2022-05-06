package com.zlzBlog.controller;

import com.zlzBlog.service.ArticleBodyService;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ArticleInfoController {
    @Autowired
    ArticleBodyService articleBodyService;
    @GetMapping("articleInfo")
    public Result getArticleInfoById(Integer id){
         return articleBodyService.getArticleInfoById(id);
    }
}
