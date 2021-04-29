package com.liu.learn.blog.service.Impl;

import com.liu.learn.blog.dao.ArticleDao;
import com.liu.learn.blog.domain.Article;
import com.liu.learn.blog.service.ArticleService;
import com.liu.learn.blog.view.ArticleVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Override
    public List<ArticleVo> find() {
        List<Article> articleList = articleDao.find();
        List<ArticleVo> articleVoList = new ArrayList<>();
        for(Article article : articleList){
            ArticleVo articleVo = new ArticleVo();
            BeanUtils.copyProperties(article, articleVo);
            articleVoList.add(articleVo);
        }
        return articleVoList;
    }

    @Override
    public void save(ArticleVo articleVo) {
        Article article = new Article();
        article.setId(UUID.randomUUID().toString().replace("-","").toUpperCase());
        article.setCreateTime(new Date());
        article.setTitle(articleVo.getTitle());
        article.setContent(articleVo.getContent());
        articleDao.save(article);
    }
}
