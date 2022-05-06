package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.mapper.TagsMapper;
import com.zlzBlog.pojo.Tags;
import com.zlzBlog.service.TagsService;
import com.zlzBlog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @author 23340
* @description 针对表【tags】的数据库操作Service实现
* @createDate 2022-04-27 11:11:38
*/
@Service
public class TagsServiceImpl extends ServiceImpl<TagsMapper, Tags>
    implements TagsService{
@Autowired
TagsMapper tagsMapper;
@Transactional
    @Override
    public Result getTags() {
        List<Tags> tags = tagsMapper.selectList(null);
        return Result.success(tags);
    }

    @Override
    public Result getTagsById(Long id) {
        Tags tags = tagsMapper.selectById(id);
        return Result.success(tags);
    }
}




