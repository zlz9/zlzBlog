package com.zlzBlog.controller;

import com.zlzBlog.service.ArticlesService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
//@CrossOrigin
public class ArticleController {
    @Autowired
    ArticlesService articlesService;
    @GetMapping("articles")
    public Result listArticle(PageParams pageParams){
        return articlesService.listArticle(pageParams);
    }

}
