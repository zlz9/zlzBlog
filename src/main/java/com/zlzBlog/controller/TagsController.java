package com.zlzBlog.controller;

import com.zlzBlog.service.TagsService;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class TagsController {
 @Autowired
    TagsService tagsService;
 @GetMapping("tags")
     public Result getTags(){
       return tagsService.getTags();
     }
}
