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
 * @auth ������
 * @time 2019��5��2������10:49:49
 */

public class test {

	@Test
	public void selectAllStu() throws Exception {

		// 1. ��ȡsqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("Configuration.xml"));
		// 2. ��ȡSqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// ���������ļ��е�sql���
		List<Grade> list = sqlSession.selectList("Grade.selectAllInfo");

		for (Grade grade : list) {
			System.out.println("�༶��" + grade.getGname());
			for (Student stu : grade.getStus()) {
				System.out.println("ѧ����" + stu.getSname());
			}
		}

		sqlSession.close();
	}

}
