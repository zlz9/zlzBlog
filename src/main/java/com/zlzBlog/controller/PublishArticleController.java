package com.zlzBlog.controller;

import com.zlzBlog.service.ArticlesService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.ArticleParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PublishArticleController {
    @Autowired
    ArticlesService articlesService;
    @PostMapping("publish")
    public Result Publish(@RequestBody ArticleParams articleParams){
        return articlesService.Publish(articleParams);
    }
}
