package com.servlet.test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.RequestController;

@WebServlet(urlPatterns = "/board")
public class testAction extends RequestController{
	@Override
	public String result(HttpServletRequest req,HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in here");
		return "test.jsp";
	}
}
