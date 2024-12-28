package Com.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SPELApp {
	
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("Com/SPEL/SPEL.xml");
		Demo dm = context.getBean("demo",Demo.class);
		
		System.out.println(dm);
	}
}
