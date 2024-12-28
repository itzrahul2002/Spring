package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Emp.xml");
        Employee e = (Employee) context.getBean("emp");

        System.out.println(e);
        System.out.println(e.getSalary());
    }
    
}
