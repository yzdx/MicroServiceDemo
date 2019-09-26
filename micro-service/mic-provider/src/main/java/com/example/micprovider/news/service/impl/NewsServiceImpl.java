package com.example.micprovider.news.service.impl;

import com.example.micprovider.news.dao.NewsMapper;
import com.example.micprovider.news.entities.News;
import com.example.micprovider.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> getAll() {
        return newsMapper.getAll();
    }
}
