package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello=(Hello) context.getBean("helloProxy");
		
		hello.method1();
		hello.method2();
		((ConfigurableApplicationContext)context).close();
	}
}
