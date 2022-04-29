package com.zlzBlog.service;

import com.zlzBlog.pojo.Articles;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.params.ArticleParams;
import com.zlzBlog.vo.params.PageParams;

/**
* @author 23340
* @description 针对表【articles】的数据库操作Service
* @createDate 2022-04-27 11:11:37
*/
public interface ArticlesService extends IService<Articles> {

    Result listArticle(PageParams pageParams);

    Result Publish(ArticleParams articleParams);

    Result deleteArticleById(Long id);
}
