package com.qyb.tagfavorite.mapper;

import java.util.List;

import com.qyb.tagfavorite.entity.Tag;

public interface TagMapper {
	//查询所有的Tag
	public List<Tag> findAll();
	
	//Tag是否存在
	public List<Tag> isTag(String tag);
	
	//添加Tag
	public int addTag(String tag);
	
	// tag中count加一
	public int addcount(String tag);
	
}
