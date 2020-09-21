package spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DemoAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Around - before method: " + invocation.getMethod().getName());

		try {
			Object result = invocation.proceed();

			System.out.println("Around - before method: " + invocation.getMethod().getName());
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("Around - throw advice method: " + invocation.getMethod().getName());
			throw e;
		}
	}

}
