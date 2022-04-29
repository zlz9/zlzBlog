package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.pojo.ArticleBody;
import com.zlzBlog.service.ArticleBodyService;
import com.zlzBlog.mapper.ArticleBodyMapper;
import com.zlzBlog.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 23340
* @description 针对表【article_body】的数据库操作Service实现
* @createDate 2022-04-27 11:11:37
*/
@Slf4j
@Service
public class ArticleBodyServiceImpl extends ServiceImpl<ArticleBodyMapper, ArticleBody>
    implements ArticleBodyService{
@Autowired
ArticleBodyMapper articleBodyMapper;
    @Override
    public Result getArticleInfoById(Integer id) {
        ArticleBody articleBody = articleBodyMapper.selectById(id);
        return Result.success(articleBody);
    }
}




