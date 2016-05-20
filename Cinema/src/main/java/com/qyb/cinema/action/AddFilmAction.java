package com.qyb.cinema.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qyb.cinema.entity.AddBean;
import com.qyb.cinema.service.FilmService;

//ModelDriven驱动模型
@Controller("AddFilmAction")
public class AddFilmAction implements ModelDriven<AddBean>{
	@Autowired
	private FilmService filmService;
	private AddBean addBean;
	
	//发布电影
	public String addfilm(){
		LogManager.getLogger().debug("取到的查询条件==>"+addBean);
		filmService.addfilm(addBean);
		return "success";
	}
	
	@Override
	public AddBean getModel() {
		addBean=new AddBean();
		return addBean;
	}
}
