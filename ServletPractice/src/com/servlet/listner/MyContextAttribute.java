package com.servlet.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyContextAttribute
 *
 */
@WebListener
public class MyContextAttribute implements ServletContextAttributeListener {

	/**
	 * Default constructor.
	 */
	public MyContextAttribute() {
		System.out.println("MyContextAttribute Default constructor");
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("MyContextAttribute attributeAdded()");
		System.out.println(event.getName() + " " + event.getValue().toString());
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("MyContextAttribute attributeRemove()");
		System.out.println(event.getName() + " " + event.getValue().toString());
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("MyContextAttribute attributeReplaced()");
		System.out.println(event.getName() + " " + event.getValue().toString());
	}

}
