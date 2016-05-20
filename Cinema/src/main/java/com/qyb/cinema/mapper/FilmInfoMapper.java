package com.qyb.cinema.mapper;

import java.util.List;

import com.qyb.cinema.entity.AddBean;
import com.qyb.cinema.entity.FilmBean;
import com.qyb.cinema.entity.FilmInfo;

public interface FilmInfoMapper {
    int deleteByPrimaryKey(Integer filmid);

    int insert(FilmInfo record);

    int insertSelective(FilmInfo record);

    FilmInfo selectByPrimaryKey(Integer filmid);

    int updateByPrimaryKeySelective(FilmInfo record);

    int updateByPrimaryKey(FilmInfo record);
    
    List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean);
    
    int addfilm(AddBean addbean);
}