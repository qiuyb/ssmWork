package com.qyb.cinema.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qyb.cinema.entity.FilmType;
import com.qyb.cinema.service.TypeService;

public class TypeServiceImplTest {

	@Test
	public void test() {
		TypeService ts=new TypeServiceImpl();
		List<FilmType> types=ts.findAllTypes();
		System.out.println(types);
		assertNotNull(types);
	}

}
