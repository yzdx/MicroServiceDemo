package com.example.micprovider.news.controller;
import com.example.micprovider.news.entities.News;
import com.example.micprovider.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newService;


    @GetMapping("/getNews")
    @ResponseBody
     public List<News> getNews(){
        List<News> allNews = newService.getAll();
         return allNews ;
     }



}
