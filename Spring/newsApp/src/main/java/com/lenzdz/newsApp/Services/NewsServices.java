package com.lenzdz.newsApp.Services;

import com.lenzdz.newsApp.Entities.News;
import com.lenzdz.newsApp.Exceptions.MyExceptions;
import com.lenzdz.newsApp.Repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsServices {

    @Autowired
    private NewsRepository repoNews;

    public List<News> showNews() {

        List<News> articles = new ArrayList<>();
        articles = repoNews.findAll();
        return articles;

    }

    @Transactional
    public void createNews(String title, String body) throws MyExceptions {

        if (title == null || title.isBlank()) {
            throw new MyExceptions("Error: debe establecer un título.");
        }

        if (body == null || body.isBlank()) {
            throw new MyExceptions("Error: debe establecer un cuerpo para el artículo.");
        }

        if (body.length() > 2048) {
            throw new MyExceptions("Error: el texto del artículo es demasiado largo (max. 2048 caracteres).");
        }

        News article = new News();

        article.setTitle(title);
        article.setBody(body);

        repoNews.save(article);

    }

    public void modifyNewsTitle(Long id, String title) throws MyExceptions {

        if (title == null || title.isBlank()) {
            throw new MyExceptions("Error: debe establecer un título.");
        }

        Optional<News> res = repoNews.findById(id);

        if (res.isPresent()) {
            News article = res.get();
            article.setTitle(title);
        }

    }

    public void modifyNewsBody(Long id, String body) throws MyExceptions {

        if (body == null || body.isBlank()) {
            throw new MyExceptions("Error: debe establecer un cuerpo para el artículo.");
        }

        Optional<News> res = repoNews.findById(id);

        if (res.isPresent()) {
            News article = res.get();
            article.setBody(body);
        }

    }
}
