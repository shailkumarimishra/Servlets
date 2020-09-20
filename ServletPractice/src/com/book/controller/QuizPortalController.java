package com.book.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.action.LoginAction;
import com.book.action.QuizPortalBaseAction;
import com.book.action.RegistrationAction;

/**
 * Servlet implementation class QuizPortalController
 */
@WebServlet("/controller.do")
public class QuizPortalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginAction loginAction = null;
	private QuizPortalBaseAction action=null;
	private RegistrationAction regAction=null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuizPortalController() {

	}

	@Override
	public void init(ServletConfig config) {
		loginAction = new LoginAction();
		regAction=new RegistrationAction();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.endsWith("login.do")) {
			action=loginAction;
			
		}
		else if(uri.endsWith("registration.do")) {
			action=regAction;
		}
		String page="";
		try {
			page=action.process(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher(page).forward(request, response);

	}

}







