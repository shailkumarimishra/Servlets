package com.book.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends QuizPortalBaseAction{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
//1.Collect user submitted data
//		2.verify user by calling service()
//		3.if user valid then return "welcome" 
//		4.else return "login"
		String page="welcome";
		return page;
	}

}
