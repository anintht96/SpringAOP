package spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello=(Hello) context.getBean("helloProxy");
		
		hello.method1();
		System.out.println("\n");
		hello.method2();
		System.out.println("\n");
		hello.method3();
		
		context.close();
	}
}
