package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.mapper.ArticlesMapper;
import com.zlzBlog.mapper.TagsMapper;
import com.zlzBlog.pojo.ArticleTag;
import com.zlzBlog.pojo.Articles;
import com.zlzBlog.pojo.Tags;
import com.zlzBlog.service.ArticleTagService;
import com.zlzBlog.mapper.ArticleTagMapper;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author 23340
* @description 针对表【article_tag】的数据库操作Service实现
* @createDate 2022-04-27 11:11:37
*/
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag>
    implements ArticleTagService{

@Autowired
ArticleTagMapper articleTagMapper;
@Autowired
ArticlesMapper articlesMapper;
@Autowired
    TagsMapper tagsMapper;
    @Override
    public Result getArticleByTag(Long id) {
        /**
         * 根据tag_id查找文章
         * 1.创建一个文章id集合
         * 2.根据tag_id查找文章
         * 3.将所有文章id都循环放进 articleIdList
         * 4.根据文章的id集合查找文章
         */
        ArrayList<Long> articleIdList = new ArrayList<>();
        LambdaQueryWrapper<ArticleTag> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(ArticleTag::getTagId,id);
        List<ArticleTag> articleTags = articleTagMapper.selectList(lambdaQueryWrapper);
        for (ArticleTag articleTag : articleTags) {
            articleIdList.add(articleTag.getArticleId());
        }
        if (articleIdList.size()>0) {
            lambdaQueryWrapper.in(ArticleTag::getId, articleIdList);
        }
//        根据标签查文章
        List<Articles> articles = articlesMapper.selectBatchIds(articleIdList);
        return Result.success(articles);
    }
}




