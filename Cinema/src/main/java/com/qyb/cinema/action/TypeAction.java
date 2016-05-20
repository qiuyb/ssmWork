package com.qyb.cinema.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.qyb.cinema.entity.FilmType;
import com.qyb.cinema.service.TypeService;

@Controller("TypeAction")
public class TypeAction {
	@Autowired
	private TypeService typeService;
	private List<FilmType> filmTypes;   //要响应的数据
	
	public List<FilmType> getFilmTypes() {
		return filmTypes;
	}

	/*public void setFilmTypes(List<FilmType> filmTypes) {
		this.filmTypes = filmTypes;
	}*/
	
	/*//直接做异步响应，不需要进行页面跳转，所有返回类型使用void,
	 * 或者返回类型为String时，返回类型使用none
	public void getTypes(){
		//获取response对象
		HttpServletResponse response= ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("charset=utf-8");
		
		try {
			
			List<FilmType> types=typeService.findAllTypes(); //取到所有的电影类型对象
			
			//把所有的电影类型对象转换成json字符串，使用gson
			Gson gson=new Gson();    //创建gson处理对象
			String jsonResult=gson.toJson(types);   //把对象转换成json字符串
			
			
			PrintWriter out = response.getWriter();
			//out.println("{\"msg\":\"我给你了...\"}");
			out.println(jsonResult);   //响应json字符串
			out.flush();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	//直接做异步响应，不需要进行页面跳转使用struts插件包struts2-json-plugin来处理
	public String getTypes(){
		filmTypes=typeService.findAllTypes(); //取到所有的电影类型对象
		
		return "success";
	}
}
