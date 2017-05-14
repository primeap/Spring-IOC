package lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Annotation Spring container is ready");
		
		Hello h =  (Hello)ctx.getBean("helloBeanNameAnnotationBased");
		h.show();
		
	}
}
