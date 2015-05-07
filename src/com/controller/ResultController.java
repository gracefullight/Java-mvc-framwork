package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 페이지 리턴값을 쉽게 확인할 수 있도록 만들어준 interface
 * @author EK
 */
public interface ResultController {
	public String result(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
