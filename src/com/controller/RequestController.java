package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
<<<<<<< HEAD
 * ï¿½ï¿½Ã»ï¿½ï¿½ ï¿½ï¿½Æ¼ï¿½ ï¿½Ð·ï¿½ï¿½Ñ´ï¿½.
=======
 * ¿äÃ»À» Àâ¾Æ¼­ ºÐ·ùÇÑ´Ù.
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
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
<<<<<<< HEAD
			// ìš”ì²­ëœ ì„œë¸”ë¦¿ì˜ í´ëž˜ìŠ¤ ëª…ì„ ë°›ì•„ì˜¨ë‹¤.
			Class c = Class.forName(super.getServletName());
			// ê·¸ í´ëž˜ìŠ¤ë¡œ ResultController í´ëž˜ìŠ¤ì˜ ê°ì²´ë¥¼ ë™ì ìœ¼ë¡œ ìƒì„±
			ResultController servlet = (ResultController) c.newInstance();
		
			if(servlet != null){
				// ë¦¬í„´ íŽ˜ì´ì§€ ë°˜í™˜
				resultView = servlet.result(req, res);
			}else{
				// ì˜¤ë¥˜ì‹œ
=======
			// ¿äÃ»µÈ Å¬·¡½ºÀÇ °æ·Î¸¦ ¸Å°³º¯¼ö·Î ¹Þ¾Æ Å¬·¡½º °´Ã¼ »ý¼º
			Class c = Class.forName(super.getServletName());
			// Å¬·¡½º·Î inteface °´Ã¼¸¦ µ¿ÀûÀ¸·Î »ý¼º
			ResultController servlet = (ResultController) c.newInstance();
		
			if(servlet != null){
				// °á°úÈ­¸éÀ» ½É¾îÁØ´Ù.
				resultView = servlet.result(req, res);
			}else{
				// ½ÇÆÐ½Ã URL µð¹ö±ë¿ë
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
				System.out.println(req.getServletPath());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
<<<<<<< HEAD
		// ì˜¤ë²„ë¡œë”© ëœ Result ë©”ì†Œë“œì˜ ê²°ê³¼ íŽ˜ì´ì§€ë¥¼ Dispatcher í•´ì¤€ë‹¤.
=======
		// ¿äÃ»µÈ Å¬·¡½ºÀÇ OverloadµÈ Result ÇÔ¼ö¿¡¼­ ¹ÝÈ¯°ªÀÌ ÀÖÀ» °æ¿ì ÆäÀÌÁö Æ÷¿öµù
>>>>>>> bcd932d7b231f155ef36c372234bf32dabbb4c58
		if(resultView!=null){
			RequestDispatcher rd = req.getRequestDispatcher(resultView);
			rd.forward(req, res);
		}
	}
}
