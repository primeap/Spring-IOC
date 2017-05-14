package lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lab1.xml");
		System.out.println("Spring container is ready");
		
		Hello h =  (Hello)ctx.getBean("helloBeanName");
		h.show();
		System.out.println("============================================>>>");
		Hello hh =  (Hello)ctx.getBean("helloBeanId");
		hh.show();
		
	}
}
