package com.zlzBlog.controller;

import com.zlzBlog.service.ArticlesService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
//@CrossOrigin
public class ArticleController {
    @Autowired
    ArticlesService articlesService;
    @GetMapping("articles")
    public Result listArticle( PageParams pageParams){
        return articlesService.listArticle(pageParams);
    }
    @DeleteMapping("deleteArticle")
    public Result deleteArticleById(Long id){
        return articlesService.deleteArticleById(id);
    }
    @GetMapping("allArticles")
    public Result allArticles(){
        return articlesService.allArticles();
    }
}
