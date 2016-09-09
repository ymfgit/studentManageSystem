package com.yc.test;

import static org.junit.Assert.assertNotNull;
import java.sql.Connection;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-mybatis.xml")
public class ConnTest {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Test
	public void testConn() {
		Connection con=null;
		SqlSession session=sqlSessionFactory.openSession();
		con=session.getConnection();
		assertNotNull("数据库连接失败",con);
	}
	
}
