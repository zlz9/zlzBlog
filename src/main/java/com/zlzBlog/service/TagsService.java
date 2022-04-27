package com.zlzBlog.service;

import com.zlzBlog.pojo.Tags;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zlzBlog.util.Result;

/**
* @author 23340
* @description 针对表【tags】的数据库操作Service
* @createDate 2022-04-27 11:11:38
*/
public interface TagsService extends IService<Tags> {

    Result getTags();
}
