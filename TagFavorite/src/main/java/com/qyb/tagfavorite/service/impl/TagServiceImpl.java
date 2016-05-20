package com.qyb.tagfavorite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qyb.tagfavorite.entity.Tag;
import com.qyb.tagfavorite.mapper.TagMapper;
import com.qyb.tagfavorite.service.TagService;

@Service("tagService")
public class TagServiceImpl implements TagService {
	@Autowired
	private TagMapper tagMapper;
	
	@Override
	public List<Tag> findAll() {
		return tagMapper.findAll();
	}

	@Override
	public List<Tag> isTag(String tag) {
		return tagMapper.isTag(tag);
	}

	@Override
	public int addTag(String tag) {
		return tagMapper.addTag(tag);
	}

	@Override
	public int addcount(String tag) {
		return tagMapper.addcount(tag);
	}

}
