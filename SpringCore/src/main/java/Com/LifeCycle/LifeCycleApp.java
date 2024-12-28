package Com.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Com/LifeCycle/LifeCycle.xml");
		User user =(User)context.getBean("user");
		
		System.out.println(user);
		
		context.registerShutdownHook();
	}
}
