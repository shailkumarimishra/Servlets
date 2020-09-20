package com.chain.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test.do")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phoneno");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("course");
		String state = request.getParameter("state");
		String remark = request.getParameter("remark");
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(dob);
		System.out.println(gender);
		Arrays.stream(courses).forEach(System.out::println);
		System.out.println(state);
		System.out.println(remark);
		request.setAttribute("username",username);
		request.setAttribute("password",pwd);
		request.setAttribute("email",email);
		request.setAttribute("phone",phone);
		request.setAttribute("dob",dob);
		request.setAttribute("gender",gender);
		request.setAttribute("courses",courses);
		request.setAttribute("state",state);
		request.setAttribute("remark",remark);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
	
	
	
	
	
	
	
	
	
	
	

}
