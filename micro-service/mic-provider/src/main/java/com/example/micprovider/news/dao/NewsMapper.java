package com.example.micprovider.news.dao;


import com.example.micprovider.news.entities.News;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface NewsMapper {

    /**
     *  获取全部消息
     * @return
     */
    List<News> getAll();
}
