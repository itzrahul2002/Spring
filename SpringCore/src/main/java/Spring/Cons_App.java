package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cons_App {
    public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("Const.xml");
		// Cons_Person  c_Person =(Cons_Person) context.getBean("Person");

        ApplicationContext context = new ClassPathXmlApplicationContext("Const.xml");
        Cons_Addition ans = (Cons_Addition)context.getBean("add");

        System.out.println(ans);

        // System.out.println(c_Person);
	}
}
