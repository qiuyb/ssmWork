package com.qyb.tagfavorite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qyb.tagfavorite.entity.Favorite;
import com.qyb.tagfavorite.entity.Tag;
import com.qyb.tagfavorite.mapper.FavoriteMapper;
import com.qyb.tagfavorite.mapper.TagMapper;
import com.qyb.tagfavorite.service.FavoriteService;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	private FavoriteMapper favoriteMapper;
	@Autowired
	private TagMapper tagMapper;

	@Override
	public List<Favorite> findAll() {
		return favoriteMapper.findAll();
	}

	@Override
	public List<Favorite> findByTname(String t_name) {
		return favoriteMapper.findByTname(t_name);
	}

	@Override
	public List<Favorite> findByTnameNull() {
		return favoriteMapper.findByTnameNull();
	}

	@Override
	public List<Favorite> find(String type){
		if(type=="allsl"||"allsl".equals(type)){
			return findAll();
		}else if(type=="wei"||"wei".equals(type)){
			return findByTnameNull();
		}else{
			return findByTname("%"+type+"%");
		}
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
	@Transactional
	public int addcount(String tag) {
		return tagMapper.addcount(tag);
	}

	@Override
	@Transactional
	public int addFavorite(Favorite favorite) {
		return favoriteMapper.addFavorite(favorite);
	}

	@Override
	@Transactional
	public void add(Favorite favorite) {
		String tagss=favorite.getF_tags();
		if("".equals(tagss)){
			
		}else{
			String a[]=tagss.split(",");

			for(int i=0;i<a.length;i++){
				List<Tag> istag=isTag(a[i].trim());
				
				if(!"[]".equals(istag.toString())){
					addcount(a[i].trim());
				}else{
					addTag(a[i].trim());
				}
			}
		}
		addFavorite(favorite);
	}
}
