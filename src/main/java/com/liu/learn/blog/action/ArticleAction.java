package com.liu.learn.blog.action;

import com.liu.learn.blog.service.ArticleService;
import com.liu.learn.blog.utils.Response;
import com.liu.learn.blog.view.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("article")
@Controller
public class ArticleAction {
    @Autowired
    private ArticleService articleService;

    @PostMapping("find")
    @ResponseBody
    public Response find(){
        List<ArticleVo> articleVoList = articleService.find();
        return new Response().addResult(articleVoList).success();
    }

    @PostMapping("save")
    @ResponseBody
    public Response save(ArticleVo articleVo){
        articleService.save(articleVo);
        return new Response().success();
    }
}
