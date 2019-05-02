package test;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.Grade;
import entity.Student;

/**
 * @auth 饶婷婷
 * @time 2019年5月2日上午10:49:49
 */

public class test {

	@Test
	public void selectAllStu() throws Exception {

		// 1. 获取sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("Configuration.xml"));
		// 2. 获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 调用配置文件中的sql语句
		List<Grade> list = sqlSession.selectList("Grade.selectAllInfo");

		for (Grade grade : list) {
			System.out.println("班级：" + grade.getGname());
			for (Student stu : grade.getStus()) {
				System.out.println("学生：" + stu.getSname());
			}
		}

		sqlSession.close();
	}

}
