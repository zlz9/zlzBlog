package com.zlzBlog.vo.params;

import com.zlzBlog.vo.TagVo;
import lombok.Data;

import java.util.List;

@Data
public class EditorArticleParams {
    private Long id;
    private String content;
    private String contentHtml;
    private List<TagVo> tags;
    private  String category;
    private String summary;
    private String title;
    private String description;
}
