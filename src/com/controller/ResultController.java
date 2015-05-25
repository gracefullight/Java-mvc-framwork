package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 구조를 통일시키기 위해 만든 인터페이스
 * @author EK
 */
public interface ResultController {
	public String result(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
