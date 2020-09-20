package com.servlet.listner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/logout.do")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/**	HttpSession session = request.getSession();
		String email = request.getParameter("email");
		System.out.println(email);
		ServletContext ctx = session.getServletContext();
		System.out.println("Storing attribute in context");
		ctx.setAttribute("email", email);
		System.out.println("replacing attribute from context");
		ctx.setAttribute("email","anjali@gmail.com");
		System.out.println("removing attribute from context");
		ctx.removeAttribute("email");**/
		HttpSession session =null;
		System.out.println(session);
		if(session==null) {
			session.invalidate();
		}
		request.getRequestDispatcher("logout.jsp").forward(request, response);
		
		
		/**PrintWriter out = response.getWriter();
		out.write("<h1>verify the server console</h1>");**/
	}

}





