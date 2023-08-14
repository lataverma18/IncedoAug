package demo.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.springcore.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
    	 AbstractApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
       ac.registerShutdownHook();
        System.out.println("Starting of Main");
        Employee e=ac.getBean(Employee.class);
        //Employee e=(Employee)ac.getBean("emp1");
        e.greet();
        Employee e1=ac.getBean(Employee.class);
        System.out.println(e);
        System.out.println(e1);
    }
}
