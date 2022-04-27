package com.zlzBlog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@MapperScan("com.zlzBlog.mapper")
@EnableTransactionManagement
public class ZlzBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZlzBlogApplication.class, args);
    }

}
