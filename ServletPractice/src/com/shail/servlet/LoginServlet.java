package com.shail.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RequestDispatcher rd =null;
		if(password.equals("ambe")) {
			rd=request.getRequestDispatcher("success.jsp");
		}else {
			rd=request.getRequestDispatcher("fail.jsp");
		}
		System.out.println(email+" "+password);
//		Q. How we can create session object?
		HttpSession session = request.getSession();
		session.setAttribute("name",email);
//		Q. To write content to the browser? 
	/**	PrintWriter out=response.getWriter();
		out.write(msg);
		out.flush();
		out.close();**/
		rd.forward(request, response);
	}

}
