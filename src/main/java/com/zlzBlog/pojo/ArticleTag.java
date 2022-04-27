package com.zlzBlog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName article_tag
 */
@TableName(value ="article_tag")
@Data
public class ArticleTag implements Serializable {
    /**
     * 标签id
     */
    @TableId
    private Long id;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 标签id
     */
    private Long tagId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}