package com.qyb.myprofile.test;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnTest {
	@Test
	public void testConn() {
		ApplicationContext act=new ClassPathXmlApplicationContext("spring.xml");
		DataSource source=(DataSource) act.getBean("dataSource");
		Connection con=null;
		try {
			con=source.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertNotNull(con);
	}

	@Test
	public void testConn01() {
		Connection con=null;
		
		ApplicationContext act=new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionFactory factory=(SqlSessionFactory) act.getBean("sqlSessionFactory");
		SqlSession session=factory.openSession();
		con=session.getConnection();
		assertNotNull(con);
	}
}
