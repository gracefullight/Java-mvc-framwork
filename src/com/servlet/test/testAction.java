package com.servlet.test;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.RequestController;
import com.db.bean.TestBean;
import com.db.dao.testDao;

@WebServlet(urlPatterns = "/testPage")
public class testAction extends RequestController{
	@Override
	public String result(HttpServletRequest req,HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in here");
		
		ArrayList<TestBean> testList = testDao.getInstance().getUserList();
		//String pass = ;
		req.setCharacterEncoding("utf-8");
		req.setAttribute("list", testList);
		//req.setAttribute();
		return "view/test.jsp";
	}
}
