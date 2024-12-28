package Com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
	public static void main(String[] args) {
	 ApplicationContext contxt = new ClassPathXmlApplicationContext("Com/Collection/Student.xml");
	 Student std = (Student)contxt.getBean("std");
	 System.out.println(std);
	 
	}
}
