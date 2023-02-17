package com.gio.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	
	// inside execution() is written pointcut expressions
	
//	@Before("execution(public void addAccount())")
//	@Before("execution(public void com.gio.aopdemo.dao.AccountDAO.addAccount())")
//	@Before("execution(void add*())")
//	@Before("execution(* add*())")
//	@Before("execution(* add*(*))")
//	@Before("execution(* add*(com.gio.aopdemo.Account))")
//	@Before("execution(* add*(com.gio.aopdemo.dao.*.*))")
//	@Before("execution(* com.gio.aopdemo.dao.*.*(..))")
	@Before("execution(* add*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on addAccount");
	}
	
}
