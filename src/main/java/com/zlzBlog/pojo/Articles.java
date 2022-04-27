package com.zlzBlog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName articles
 */
@TableName(value ="articles")
@Data
public class Articles implements Serializable {
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
    private Long createTime;

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
     * 标签id
     */
    private Long tagId;

    /**
     * 分类id
     */
    private Long categoryId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}