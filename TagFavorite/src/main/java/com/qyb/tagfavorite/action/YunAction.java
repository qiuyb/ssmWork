package com.qyb.tagfavorite.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qyb.tagfavorite.entity.Favorite;
import com.qyb.tagfavorite.entity.Tag;
import com.qyb.tagfavorite.service.FavoriteService;
import com.qyb.tagfavorite.service.TagService;

@Controller("YunAction")
public class YunAction implements ModelDriven<Favorite>,SessionAware {
	@Autowired
	private  FavoriteService favoriteService;
	@Autowired
	private  TagService tagService;

	private Favorite favorite;
	private String type;
	private Map<String, Object> session;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	//点击添加
	public String add(){
		return "add";
	}
	//点击进入主界面
	public String list(){
		Yunlis();
		return "List";
	}
	public void Yunlis(){
		List<Tag> tags=tagService.findAll();
		List<Favorite> favorites=favoriteService.findAll();
		session.put("tags",tags);
		session.put("favorites",favorites);
	}
	//点击某个Tag
	public String Seach(){
		List<Favorite> favorites=favoriteService.find(type);
		session.put("favorites",favorites);
		return "List";
	}
	//点击云图
	public String toYun(){
		List<Tag> tags=tagService.findAll();
		session.put("tags",tags);
		return "toyun";
	}

	//点击确定按钮
	public String save(){
		LogManager.getLogger().debug("favorite==>取到的值..."+favorite);
		try {
			favoriteService.add(favorite);
			Yunlis();
			return "List";
		} catch (Exception e) {
			session.put("addMsg", "添加书签失败....");
		}
		return "add";
	}

	@Override
	public Favorite getModel() {
		this.favorite =new Favorite();
		return favorite;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
