package com.vilas.ch1.scope.singleton;

//Influenced by Geeks of Geeks

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args)
	{
		// Load the Spring XML configuration
		// file into IoC container
		ApplicationContext ap = new ClassPathXmlApplicationContext(
				"singleton.xml");

		// Get the "HelloWorld" bean object
		// and call getName() method
		Singleton mys
			= (Singleton)ap.getBean("s");

		// Set the name
		mys.setName("Vilas");
		System.out.println("Welcome - Your name is: "+ mys.getName());

		// Get another "HelloWorld" bean object
		// and call getName() method
		Singleton mys1 = (Singleton)ap.getBean("s");

		System.out.println("Welcome - Your name is: "+ mys1.getName());

		// Now compare the references to see
		// whether they are pointing to the
		// same object or different object
		System.out.println(mys== mys1);
	}
}
