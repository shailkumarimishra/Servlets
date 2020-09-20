package com.servlet.listner;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyRequestListner
 *
 */
@WebListener
public class MyRequestListner implements ServletRequestListener {

	/**
	 * Default constructor.
	 */
	public MyRequestListner() {
		System.out.println("MyRequestListner default constructor");
	}

	/**
	 * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
	 */
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("MyRequestListner requestDestroyed()");
	}

	/**
	 * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
	 */
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("MyRequestListner requestInitialized()");
	}

}
