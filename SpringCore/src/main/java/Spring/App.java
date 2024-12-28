package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Student student = (Student) context.getBean("Student");
        Student student2 = (Student) context.getBean("student1");
        Student student3 = (Student) context.getBean("student2");
        
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("First Spring Programme");
    }
}
