package com.qyb.tagfavorite.mapper;

import java.util.List;
import java.util.Map;

import com.qyb.tagfavorite.entity.Favorite;

public interface FavoriteMapper {
	// 查询所有的Favorite
	public List<Favorite> findAll();
	
	//根据Tag名字查询Favorite
	public List<Favorite> findByTname(String t_name);
	
	// 查询没有T—name 的favorite
	public List<Favorite> findByTnameNull();
	
	// 添加Favorite
	public int addFavorite(Favorite favorite);
	
}
