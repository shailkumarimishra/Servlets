package com.servlet.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyContextListner
 *
 */
@WebListener
public class MyContextListner implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public MyContextListner() {
		System.out.println("MycontextListner Default constructor");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("MycontextListner Destroyed()");
		ServletContext servletContext = event.getServletContext();
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("MyContextListner Initialized method");
		ServletContext ctx = event.getServletContext();
		ctx.setAttribute("TV",0);
		ctx.setAttribute("TA",0);
		
	}

}



