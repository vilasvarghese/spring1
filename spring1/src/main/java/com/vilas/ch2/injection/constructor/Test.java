package com.vilas.ch2.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.vilas.ch2.injection.constructor.Employee;

public class Test {  
    public static void main(String[] args) {  
          
	    ApplicationContext context= new ClassPathXmlApplicationContext("constructor.xml");
        Employee emp= (Employee) context.getBean("emp");
        emp.show();
          
    }  
}  