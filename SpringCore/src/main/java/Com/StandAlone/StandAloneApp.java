package Com.StandAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneApp {
	public static void main(String[] args) {
	
		ApplicationContext contxt  = new ClassPathXmlApplicationContext("Com/StandAlone/StandAlone.xml");
		Person p =(Person)contxt.getBean("per");
		System.out.println(p);
		
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getCenter().getClass().getName());
	}
}
