package com.spring.firstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("StudentConfig.xml");
		Student student = (Student) appCon.getBean("studentBean");
		student.print();
		
	}

}
