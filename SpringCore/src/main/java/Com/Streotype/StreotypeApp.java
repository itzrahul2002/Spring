package Com.Streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StreotypeApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Com/Streotype/Streotype.xml");
//		Student std =context.getBean("student",Student.class);
//		
//		System.out.println(std);
//		System.out.println(std.hashCode());
//		
//		Student s2 =context.getBean("student",Student.class);
//		System.out.println(s2);
//		
//		System.out.println(s2.hashCode());
		
		Teacher tach = context.getBean("teacher",Teacher.class);
		System.out.println(tach);
		System.out.println(tach.hashCode());
		
		
		Teacher tach1 = context.getBean("teacher",Teacher.class);
		System.out.println(tach1);
		System.out.println(tach1.hashCode());
		
	}
}
