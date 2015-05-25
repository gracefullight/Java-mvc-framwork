package com.servlet.android;

import java.util.HashMap;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.RequestController;
import com.google.gson.Gson;

@WebServlet(urlPatterns = "/setMacAddr")
public class setMacAddrAction extends RequestController{
	@Override
	public String result(HttpServletRequest req,HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in this");
		
		Gson g = new Gson();
		HashMap<String, String> arr = g.fromJson(req.getParameter("param"), HashMap.class);
		//
		return null;
	}
}
