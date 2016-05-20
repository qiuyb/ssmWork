package com.yc.vote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.vote.entity.AddSubjectBean;
import com.yc.vote.entity.Option;
import com.yc.vote.mapper.SubjectMapper;
import com.yc.vote.service.SubjectService;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{
	@Autowired
	private SubjectMapper subjectMapper;

	@Override @Transactional
	public AddSubjectBean addSubject(AddSubjectBean addSubjectBean) {
		subjectMapper.insertSubject(addSubjectBean);
		return addSubjectBean;
	}

	@Override @Transactional
	public void addOption(Option option) {
		subjectMapper.insertOption(option);
	}

	@Override @Transactional
	public void add(AddSubjectBean addSubjectBean) {
		//1.插入主题subject
		addSubjectBean=addSubject(addSubjectBean);

		//2.插入选项
		List<String> options=addSubjectBean.getOptions();
		for (int i = 0; i <addSubjectBean.getOptions().size(); i++) {
			Option option=new Option(options.get(i),addSubjectBean.getVsId(),i+1);
			addOption(option);
		}
	}
}
