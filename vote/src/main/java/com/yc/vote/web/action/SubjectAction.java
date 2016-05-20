package com.yc.vote.web.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.service.SubjectService;

@Controller("subjectAction")
public class SubjectAction implements ModelDriven<AddSubjectBean>{
	@Autowired
	private SubjectService subjectService;
	
	private AddSubjectBean addSubjectBean;
	
	//打开添加投票页面
	public String add(){
		return "add";
	}
	
	//添加投票
	public String save(){
		LogManager.getLogger().debug("SubjectAction==>取到的值..."+addSubjectBean);
		
		try {
			subjectService.add(addSubjectBean);
			return "addSuccess";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "add";
	}

	@Override
	public AddSubjectBean getModel() {
		addSubjectBean=new AddSubjectBean();
		return addSubjectBean;
	}
}
