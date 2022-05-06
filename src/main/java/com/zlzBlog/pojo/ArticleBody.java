package com.zlzBlog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName article_body
 */
@TableName(value ="article_body")
@Data
public class ArticleBody implements Serializable {
    /**
     * 文章id
     */
    @TableId
    private Long id;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章内容html
     */
    private String contentHtml;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}