package Com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("Com/Collection/Collection.xml");
		Employee e = (Employee)con.getBean("emp");
		
		System.out.println(e);
	}
}	
