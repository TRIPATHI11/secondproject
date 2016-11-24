package org.amit.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void loggingAdvice()
	{
		System.out.println("Before Advice is run.Get Method called.");
		
	}
	
	@After("execution(public String getName())")
	public void afterLoggingAdvice()
	{
		System.out.println("After Advice is run.Get Method called.");
	}
	
	/*@Before("execution(public String org.amit.model.Circle.getName())")
	public void loggingAdvice()
	{
		System.out.println("Advice is run.Get Method called.");
		
	}*/
	
	
	/*@Before("allGetters()")
	public void loggingAdvice()
	{
		System.out.println("Advice is run.Get Method called.");
		
	}*/
	
	/*@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second Advice is run.Get Method called.");
		
	}*/
	
	/*@Pointcut("execution(public * getName())")
	public void allGetters(){}*/
	
	
	/*@Before("allGetters()")
	public void loggingAdvice(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
		
	}*/
	
	
	/*@After("allGetters()")
	public void loggingAdvice(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.toString());
		//System.out.println(joinPoint.getTarget());
		
	}*/
	
	/*@Around("allGetters()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object value =null;
		try {
			
			System.out.println("beforeAdvice");
			value = proceedingJoinPoint.proceed();
			System.out.println("after advice");
		} catch (Throwable e) {
			System.out.println("after throw");
		}
		
		System.out.println("after finally");
		return value;
	}*/
}
