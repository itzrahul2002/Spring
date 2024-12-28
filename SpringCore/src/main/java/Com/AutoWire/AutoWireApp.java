package Com.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireApp {
	public static void main(String[] args) {
		ApplicationContext contxt =	new ClassPathXmlApplicationContext("Com/AutoWire/AutoWire.xml");
		Employee employee = (Employee) contxt.getBean("emp");
		
		System.out.println(employee);
	}
}
