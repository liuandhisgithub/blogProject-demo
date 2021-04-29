package com.liu.learn.blog.dao;

import com.liu.learn.blog.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {

    void save(Article article);

    List<Article> find();
}
