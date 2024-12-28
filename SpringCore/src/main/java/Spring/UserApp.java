package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("User.xml");
		User user = (User)context.getBean("user");
		
		System.out.println(user);
		System.out.println(user.getAddress().getState());
	}
}
