package com.db.dao;


import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.db.bean.UserBean;
import com.db.settings.MybatisConnector;

public class testDao extends MybatisConnector{
	
	private static testDao instance = new testDao();
	
	public static testDao getInstance() {
		return instance;
	}
	
	/**
	 * user list 가져오기
	 * @return
	 */
	public ArrayList<UserBean> getUserList(){
		ArrayList<UserBean> list= new ArrayList<UserBean>();
		
		SqlSession session = getSqlSessionFactory().openSession();
		
		try{
			list = (ArrayList)session.selectList("mappers.test.selectUser");
		}finally{
			session.close();
		}
		
		return list;
	}
}
