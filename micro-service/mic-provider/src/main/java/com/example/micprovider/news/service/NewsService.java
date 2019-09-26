package com.example.micprovider.news.service;

import com.example.micprovider.news.entities.News;

import java.util.List;


public interface NewsService {
    /**
     *  获取全部消息
     * @return
     */
    List<News> getAll();
}
