package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.EmpVo;

public class EmpManager {
	private static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/DBConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static List<EmpVo> listEmp(){
		SqlSession session = factory.openSession();
		List<EmpVo> list = session.selectList("emp.listEmp");
		session.close();
		return list;
	}
	
	public static EmpVo detailEmp(int eno) {
		SqlSession session = factory.openSession(true);
		EmpVo ev = session.selectOne("emp.detailEmp",eno);
		session.close();
		return ev;
	}
	
	public static int insertEmp(EmpVo ev) {
		SqlSession session = factory.openSession();
		int re = session.insert("emp.insertEmp",ev);
		session.commit();
		session.close();
		return re;
	}
	
	public static int deleteEmp(int eno) {
		SqlSession session = factory.openSession(true);
		int re = session.delete("emp.deleteEmp",eno);
		session.close();
		return re;
	}
}
