package com.jinho.basic.property;

import java.io.InputStream;
import java.util.Properties;

class SystemPropertyTest {
	
	public static void main(String args[]) {
		
		ClassLoader classLoader = null;
	
		System.out.println(System.getProperty("user.home")); 
		System.out.println(System.getProperty("user.dir")); 
	    
		System.out.println(System.getProperty("java.hello", "Hello, Wolrd!"));
		 
		System.out.println(System.getProperty("java.hello"));
		
		System.setProperty("java.hello", "Hello, Java!"); 
		System.out.println(System.getProperty("java.hello"));
		
	    try {

	    	
	    	// FileInputStream propertyFile;
	    	
	    	InputStream propertyFile;
	    	
	    	classLoader = Thread.currentThread().getContextClassLoader();

	    	// propertyFile = new FileInputStream("application.properties");

	    	propertyFile = classLoader.getResourceAsStream("application.properties");
	    	
	    	Properties p = new Properties(System.getProperties());

	    	p.load(propertyFile);

	    	System.setProperties(p);

	    	System.getProperties().list(System.out);

		} catch(java.io.FileNotFoundException e) {

			System.err.println("java.io.FileNotFoundException");

		} catch(java.io.IOException e) {

			System.err.println("java.io.IOException");

		}
		
	}
}


