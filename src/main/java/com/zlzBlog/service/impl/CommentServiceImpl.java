package com.zlzBlog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zlzBlog.pojo.Comment;
import com.zlzBlog.service.CommentService;
import com.zlzBlog.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author 23340
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2022-04-16 17:56:56
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




