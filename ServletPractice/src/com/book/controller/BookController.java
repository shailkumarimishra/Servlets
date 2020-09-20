package com.book.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/show.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Book> books=new ArrayList<>();
    Book book1=new Book(10,"Servlet",400);
    Book book2=new Book(20,"OS",500);
    Book book3=new Book(30,"DBMS",300);
    Book book4=new Book(40,"Java",600);
    Book book5=new Book(50,"Compiler",700);
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);
//    Map<String,Book> map=new HashMap<>();
    Map<String,List<Book>> map=new HashMap<>();
    map.put("arihant",books);
//    map.put("schand",book2);
//    map.put("rdsharma",book3);
//    How can we get session object?
//    ANS:- request.getSession():HttpSession
    HttpSession session = request.getSession();
//    How can we set value into the session?
//    ANS:- session.setAttribute(key,value): here key always String and 
//    										 value is an object type element.
    session.setAttribute("Book",books);
    session.setAttribute("pub",map);
//    How we can redirect response and request from SERVLET to JSP?
//    ANS:- with the help of getRequestDispatcher method forward(request,response)
//    How we can get RequestDispatcher class object?
//    ANS:-  RequestDispatcher rd = request.getRequestDispatcher("showbook.jsp");//path as argument
    RequestDispatcher rd = request.getRequestDispatcher("Demo.jsp");
    rd.forward(request, response);
    
    
	}

}
