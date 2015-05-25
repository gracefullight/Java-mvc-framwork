package com.db.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.db.bean.TestBean;
import com.db.settings.MybatisConnector;

public class testDao extends MybatisConnector{
	
	private static testDao instance = new testDao();
	
	public static testDao getInstance() {
		return instance;
	}
	
	/**
	 * user list ��������
	 * @return
	 */
	public ArrayList<TestBean> getUserList(){
		ArrayList<TestBean> list= new ArrayList<TestBean>();
		
		SqlSession session = getSqlSessionFactory().openSession();
		
		try{
			list = (ArrayList)session.selectList("mappers.test.selectUser");
			
		}finally{
			session.close();
		}
		
		return list;
	}
	
	/**
	 * password�� �����ͼ� ���ô�.
	 */
/*	public String getUserPass(){
		String pass="";
		try{
			pass = (String) .......;
		}finally{
			
		}
		return pass;
	}*/
}
