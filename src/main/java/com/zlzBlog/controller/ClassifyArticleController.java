package com.zlzBlog.controller;

import com.zlzBlog.service.ArticlesService;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClassifyArticleController {
     @Autowired
    private ArticlesService articlesService;
     @GetMapping("chooseArticle")
     public Result classifyArticle(String title){
         return articlesService.classifyArticle(title);
     }
}
