package Spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecyleApp {
    public static void main(String[] args) {
//        AbstractApplicationContext abcontext =  new ClassPathXmlApplicationContext("LifeCycle.xml");
//        LifeUser lfu = (LifeUser) abcontext.getBean("lifeStudent");
//
//        System.out.println(lfu);
//
//        abcontext.registerShutdownHook();
    	
    	
//    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
//    	LifeUser1 lfu1 = (LifeUser1)context.getBean("lifeuser1");
//    	
//    	System.out.println(lfu1);
//    	context.registerShutdownHook();
    	
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
      LifeUser2 lf2 =(LifeUser2) context.getBean("lifeuser2");
      
      System.out.println(lf2);
      
      context.registerShutdownHook();
      
    }
}
