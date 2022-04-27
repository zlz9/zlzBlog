package com.zlzBlog.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
@Data
public class ArticlesVo {
    /**
     * 文章id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 评论数
     */
    private Long commentCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 文章摘要
     */
    private String summary;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 浏览数量
     */
    private Long viewCounts;

    /**
     * 权重
     */
    private Long weight;

    /**
     * 作者id
     */
    private Long authorId;

    /**
     * 文章内容id
     */
    private Long bodyId;

    /**
     * 分类id
     */
    private Long categoryId;
}
