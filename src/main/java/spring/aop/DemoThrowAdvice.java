package spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class DemoThrowAdvice implements ThrowsAdvice{

	public void afterThrowing(IllegalArgumentException exception) {
		System.out.println("Throw advice method: ");
	}
}
