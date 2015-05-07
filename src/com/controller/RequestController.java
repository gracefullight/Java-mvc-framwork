package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 요청을 잡아서 분류한다.
 * @author EK
 */
public abstract class RequestController extends HttpServlet implements ResultController{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			reqProcess(req, res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			reqProcess(req, res);
	}
	
	public void reqProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String resultView = "";
		try{
			// 요청된 클래스의 경로를 매개변수로 받아 클래스 객체 생성
			Class c = Class.forName(super.getServletName());
			// 클래스로 inteface 객체를 동적으로 생성
			ResultController servlet = (ResultController) c.newInstance();
		
			if(servlet != null){
				// 결과화면을 심어준다.
				resultView = servlet.result(req, res);
			}else{
				// 실패시 URL 디버깅용
				System.out.println(req.getServletPath());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// 요청된 클래스의 Overload된 Result 함수에서 반환값이 있을 경우 페이지 포워딩
		if(resultView!=null){
			RequestDispatcher rd = req.getRequestDispatcher(resultView);
			rd.forward(req, res);
		}
	}
}
