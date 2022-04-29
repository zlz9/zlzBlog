package com.zlzBlog.controller;

import com.zlzBlog.service.ArticleTagService;
import com.zlzBlog.service.TagsService;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class TagsController {
 @Autowired
    TagsService tagsService;
 @Autowired
    ArticleTagService articleTagService;
 @GetMapping("tags")
     public Result getTags(){
       return tagsService.getTags();
     }
     @GetMapping("tag/id={id}")
    public Result getTagsById(@PathVariable Long id){
     return articleTagService.getArticleByTag(id);
     }
}
