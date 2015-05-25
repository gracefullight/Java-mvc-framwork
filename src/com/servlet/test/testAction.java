package com.servlet.test;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.RequestController;
<<<<<<< HEAD
import com.db.bean.TestBean;
=======
import com.db.bean.UserBean;
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
import com.db.dao.testDao;

@WebServlet(urlPatterns = "/testPage")
public class testAction extends RequestController{
	@Override
	public String result(HttpServletRequest req,HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in here");
		
<<<<<<< HEAD
		ArrayList<TestBean> testList = testDao.getInstance().getUserList();
		//String pass = ;
		req.setCharacterEncoding("utf-8");
		req.setAttribute("list", testList);
		//req.setAttribute();
=======
		ArrayList<UserBean> testList = testDao.getInstance().getUserList();
		
		req.setCharacterEncoding("utf-8");
		req.setAttribute("list", testList);
		
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
		return "view/test.jsp";
	}
}
