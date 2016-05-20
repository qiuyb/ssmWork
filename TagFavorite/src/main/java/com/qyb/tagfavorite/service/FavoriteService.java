package com.qyb.tagfavorite.service;

import java.util.List;

import com.qyb.tagfavorite.entity.Favorite;
import com.qyb.tagfavorite.entity.Tag;

public interface FavoriteService {
	// 查询所有的Favorite
	public List<Favorite> findAll();

	//根据Tag名字查询Favorite
	public List<Favorite> findByTname(String t_name);

	// 查询没有T—name 的favorite
	public List<Favorite> findByTnameNull();

	// 添加Favorite
	public int addFavorite(Favorite favorite);

	public List<Favorite> find(String type);

	public void add(Favorite favorite);

	//Tag是否存在
	public List<Tag> isTag(String tag);

	//添加Tag
	public int addTag(String tag);

	// tag中count加一
	public int addcount(String tag);
}
