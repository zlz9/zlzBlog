package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.mapper.ArticleBodyMapper;
import com.zlzBlog.mapper.ArticleTagMapper;
import com.zlzBlog.mapper.ArticlesMapper;
import com.zlzBlog.mapper.TagsMapper;
import com.zlzBlog.pojo.ArticleBody;
import com.zlzBlog.pojo.ArticleTag;
import com.zlzBlog.pojo.Articles;
import com.zlzBlog.service.ArticlesService;
import com.zlzBlog.util.Result;
import com.zlzBlog.vo.TagVo;
import com.zlzBlog.vo.params.ArticleParams;
import com.zlzBlog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
* @author 23340
* @description 针对表【articles】的数据库操作Service实现
* @createDate 2022-04-27 11:11:37
*/
@Transactional
@Service
public class ArticlesServiceImpl extends ServiceImpl<ArticlesMapper, Articles>
    implements ArticlesService{
    @Autowired
    ArticlesMapper articlesMapper;
    @Autowired
    ArticleTagMapper articleTagMapper;
    @Autowired
    ArticleBodyMapper articleBodyMapper;
    @Autowired
    TagsMapper tagsMapper;
    @Override
    public Result listArticle(PageParams pageParams) {
        Page<Articles> page = new Page<>(pageParams.getPage(), pageParams.getPageSize());
        LambdaQueryWrapper<Articles> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(Articles::getCreateTime);
        Page<Articles> ArticlesPage = articlesMapper.selectPage(page,queryWrapper);
        List<Articles> recods = ArticlesPage.getRecords();
        return Result.success(recods);
    }
@Transactional
    @Override
    public Result Publish(ArticleParams articleParams) {
        Articles articles = new Articles();
        articles.setWeight(0L);
        articles.setCommentCount(0L);
        articles.setSummary(articleParams.getSummary());
        articles.setTitle(articleParams.getTitle());
        articles.setCreateTime(System.currentTimeMillis());
        articles.setAuthorId(1L);
       articlesMapper.insert(articles);
       articlesMapper.updateById(articles);
//        tag
        List<TagVo> tags = articleParams.getTags();
        if (tags != null) {
            for (TagVo tag : tags) {

                ArticleTag articleTag = new ArticleTag();
                articleTag.setTagId(tag.getId());
                articleTag.setArticleId(articles.getId());
                articleTagMapper.insert(articleTag);
                articleTagMapper.updateById(articleTag);
            }
        }
//        body
        ArticleBody articleBody = new ArticleBody();
        articleBody.setId(articles.getId());
        articleBody.setContent(articleParams.getBody().getContent());
        articleBody.setContentHtml(articleParams.getBody().getContentHtml());
        articleBodyMapper.insert(articleBody);
        articlesMapper.updateById(articles);
        HashMap<String, String> map = new HashMap<>();
        map.put("id",articles.getId().toString());
        return Result.success(map);
    }
}




