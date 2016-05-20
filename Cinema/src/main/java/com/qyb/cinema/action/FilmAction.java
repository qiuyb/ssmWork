package com.qyb.cinema.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qyb.cinema.entity.FilmBean;
import com.qyb.cinema.entity.FilmInfo;
import com.qyb.cinema.service.FilmService;

//ModelDriven驱动模型
@Controller("FilmAction")
public class FilmAction implements ModelDriven<FilmBean>,SessionAware{
	@Autowired
	private FilmService filmService;
	private FilmBean filmBean;    //接收请求数据
	private Map<String, Object> session;

	//查询请求处理
	public String search(){
		LogManager.getLogger().debug("取到的查询条件==>"+filmBean);
		List<FilmInfo> films=filmService.getFilmsByFilmBean(filmBean);
		session.put("result", films);
		return "success";
	}
	
	@Override
	public FilmBean getModel() {
		filmBean=new FilmBean();
		return filmBean;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
