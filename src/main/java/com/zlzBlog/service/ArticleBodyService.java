package com.zlzBlog.service;

import com.zlzBlog.pojo.ArticleBody;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zlzBlog.util.Result;

/**
* @author 23340
* @description 针对表【article_body】的数据库操作Service
* @createDate 2022-04-27 11:11:37
*/
public interface ArticleBodyService extends IService<ArticleBody> {

    Result getArticleInfoById(Integer id);
}
