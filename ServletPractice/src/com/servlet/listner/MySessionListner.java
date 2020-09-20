package com.servlet.listner;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListner
 *
 */
@WebListener
public class MySessionListner implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public MySessionListner() {
		System.out.println("MySessionListner default constructor");
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("MySessionListner sessionCreated()");
		HttpSession session = event.getSession();
		ServletContext ctx = session.getServletContext();
		int tv =(int) ctx.getAttribute("TV");
		tv++;
		ctx.setAttribute("TV", tv);
		int ta =(int) ctx.getAttribute("TA");
		ta++;
		ctx.setAttribute("TA", ta);
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("MySessionListner sessionDestroyed()");
		HttpSession session = event.getSession();
		ServletContext ctx = session.getServletContext();
		int ta =(int) ctx.getAttribute("TA");
		ta--;
		ctx.setAttribute("TA", ta);
	}

}
