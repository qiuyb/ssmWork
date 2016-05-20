package com.qyb.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qyb.cinema.entity.FilmType;
import com.qyb.cinema.mapper.FilmTypeMapper;
import com.qyb.cinema.service.TypeService;

@Service("typeService")
public class TypeServiceImpl implements TypeService {
	@Autowired
	private FilmTypeMapper filmTypeMapper;
	
	@Override
	public List<FilmType> findAllTypes() {
		return filmTypeMapper.getAllTypes();
	}

}
