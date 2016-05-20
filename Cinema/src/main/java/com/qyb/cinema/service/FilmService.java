package com.qyb.cinema.service;

import java.util.List;

import com.qyb.cinema.entity.AddBean;
import com.qyb.cinema.entity.FilmBean;
import com.qyb.cinema.entity.FilmInfo;

public interface FilmService {
	 List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean);
	 int addfilm(AddBean addbean);
}
