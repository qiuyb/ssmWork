package com.qyb.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qyb.cinema.entity.AddBean;
import com.qyb.cinema.entity.FilmBean;
import com.qyb.cinema.entity.FilmInfo;
import com.qyb.cinema.mapper.FilmInfoMapper;
import com.qyb.cinema.service.FilmService;

@Service("filmService")
public class FilmServiceImpl implements FilmService{
	@Autowired
	private FilmInfoMapper filmInfoMapper;
	
	@Override
	public List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean) {
		return filmInfoMapper.getFilmsByFilmBean(filmBean);
	}

	@Override
	public int addfilm(AddBean addbean) {
		return filmInfoMapper.addfilm(addbean);
	}

}
