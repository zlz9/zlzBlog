package com.zlzBlog.controller;

import com.zlzBlog.service.CategoryService;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SummaryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("summary")
    public Result getSummary(){
      return categoryService.getSummary();
    }
}
