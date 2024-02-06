package com.lenzdz.newsApp.Controller;

import com.lenzdz.newsApp.Entities.News;
import com.lenzdz.newsApp.Exceptions.MyExceptions;
import com.lenzdz.newsApp.Services.NewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsServices servNews;

    @GetMapping("/")
    public String showNews(Model model) {
        String LINE = "pato";
        Integer num = 1;
        List<News> articles = servNews.showNews();
        model.addAttribute("articles", articles);
        return "news-list.html";
    }

    @GetMapping("/creation-form")
    public String createForm() {
        return "create-news.html";
    }

    @PostMapping("/create")
    public String create(@RequestParam String articleTitle, @RequestParam String articleBody, ModelMap model) {
        try {
            servNews.createNews(articleTitle, articleBody);
            model.put("success", "Éxito: la noticia fue creada correctamente.");
        } catch (MyExceptions ex){
            model.put("error", ex.getMessage());
            return "create-news.html";
        }

        return "create-news.html";
    }

}
