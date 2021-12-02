package com.vilas.ch2.injection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vilas.spring1.Student;

public class Test {
    public static void main(String[] args) {  
        
	    ApplicationContext context= new ClassPathXmlApplicationContext("setter.xml");
        Employee emp= (Employee) context.getBean("emp");
        emp.display();
    }
}
