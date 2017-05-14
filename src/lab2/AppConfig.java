package lab2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "helloBeanNameAnnotationBased")
	public Hello hello(A a, B b) {
		Hello h = new Hello(b);
		h.setaObject(a);
		return h;
	}

	@Bean(name = "aObject")
	public A creatAobject() {
		A a = new A();
		a.setA(10);
		a.setMsg("Annotation A MSG");
		return a;
	}

	@Bean(name = "bObject")
	public B creatBobject() {
		B b = new B(20, "Annotation -based-B");
		return b;
	}

}
