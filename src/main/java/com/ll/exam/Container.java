package com.ll.exam;

import com.ll.exam.article.controller.ArticleController;

import java.util.List;

public class Container {
    private static final ArticleController articleController;

    static { //클래스가 로딩될 때 딱 한번만 만든다.
        articleController = new ArticleController();
    }

    public static ArticleController getArticleController() {
        return articleController;
    }


    public static List<String> getControllerNames() {
        return List.of("home", "article");
    }
}