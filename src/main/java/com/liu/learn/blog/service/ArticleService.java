package com.liu.learn.blog.service;

import com.liu.learn.blog.view.ArticleVo;

import java.util.List;

public interface ArticleService {

    List<ArticleVo> find();

    void save(ArticleVo articleVo);

}
