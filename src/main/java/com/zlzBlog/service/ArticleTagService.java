package com.zlzBlog.service;

import com.zlzBlog.pojo.ArticleTag;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zlzBlog.util.Result;

/**
* @author 23340
* @description 针对表【article_tag】的数据库操作Service
* @createDate 2022-04-27 11:11:37
*/
public interface ArticleTagService extends IService<ArticleTag> {

    Result getArticleByTag(Long id);
}
