package Com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {
	public static void main(String[] args) {
		ApplicationContext contxt = new ClassPathXmlApplicationContext("Com/Constructor/Person.xml");
//		Person person = (Person)contxt.getBean("person");
//		
//		System.out.println(person);
		
		Addition add = (Addition)contxt.getBean("add");
		add.sum();
	}
}
