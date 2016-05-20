package com.qyb.cinema.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qyb.cinema.entity.FilmBean;
import com.qyb.cinema.entity.FilmInfo;
import com.qyb.cinema.service.FilmService;

public class FilmServiceImplTest {

	@Test
	public void testGetFilmsByFilmBean() {
		FilmService fs=new FilmServiceImpl();
		FilmBean filmBean=new FilmBean();
		List<FilmInfo> fis=fs.getFilmsByFilmBean(filmBean);
		System.out.println(fis);
		assertNotNull(fis);
	}

}
