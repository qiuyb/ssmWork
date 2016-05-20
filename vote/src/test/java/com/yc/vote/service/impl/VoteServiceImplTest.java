package com.yc.vote.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.vote.entity.OptionBean;
import com.yc.vote.entity.Subject;
import com.yc.vote.entity.SubjectBean;
import com.yc.vote.entity.VoteBean;
import com.yc.vote.service.VoteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class VoteServiceImplTest {
	@Autowired
	private VoteService voteService;
	
	@Test
	public void testFindAllSubjects() {
		List<Subject> subjects=voteService.findAllSubjects();
		System.out.println(subjects);
		assertNotNull(subjects);
	}
	
	@Test
	public void testFindAllSubjectBeans() {
		List<SubjectBean> subjects=voteService.findAllSubjectBeans();
		System.out.println(subjects);
		assertNotNull(subjects);
	}
	
	@Test
	public void testFindOptionByVsId() {
		OptionBean subjects=voteService.findOptionByVsId(101);
		System.out.println(subjects);
		assertNotNull(subjects);
	}
	
	@Test
	public void findVoteBeanByVsId() {
		VoteBean options=voteService.findVoteBeanByVsId((101));
		System.out.println(options);
		assertNotNull(options);
	}
	
}
