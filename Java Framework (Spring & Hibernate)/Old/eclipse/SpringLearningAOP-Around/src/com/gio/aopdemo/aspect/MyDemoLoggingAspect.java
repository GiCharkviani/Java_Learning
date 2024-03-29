package com.gio.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.gio.aopdemo.Account;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	
	@Around("execution(* com.gio.aopdemo.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		
		// print out method we are advising on
		String method = theProceedingJoinPoint.getSignature().toShortString();
		System.out.println("\n\n====>>> Executing @Around on method: " + method);
		
		// get begin timestamp
		long begin = System.currentTimeMillis();
		
		// now, let's execute the method
		Object result = theProceedingJoinPoint.proceed();
		
		// get end timestamp
		long end = System.currentTimeMillis();
		
		// compute duration and display
		long duration = end - begin;
		System.out.println("\n====> Duration: " + duration/1000d + " seconds");
		
		return result;
	}
	
	@After("execution(* com.gio.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n\n====>>> Executing @After (Finally) on method: " + method);
	}
	
	@AfterThrowing(
				pointcut="execution(* com.gio.aopdemo.dao.AccountDAO.findAccounts(..))",
				throwing="theExc"
			)
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExc) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n\n====>>> Executing @AfterThrowing on method: " + method);
		
		// log the exception
		System.out.println("\n====>>>The exception is: " + theExc);
	}
	
	@AfterReturning(
				pointcut="execution(* com.gio.aopdemo.dao.AccountDAO.findAccounts(..))",
				returning="result" //should match second parameter
			)
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n\n====>>> Executing @AfterReturning on method: " + method);
		
		// let's post-process ... let's modify it - :-)
		
		// convert the account names to uppercase
		convertAccountNamesToUpperCase(result);
		
		// print out the results of the method call
		System.out.println("\n====>>> result is: " + result);
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		for(Account tempAccount: result) {
			String theUpperName =  tempAccount.getName().toUpperCase();
			tempAccount.setName(theUpperName);
		}
	}

	@Before("com.gio.aopdemo.aspect.GioAopExpression.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n=====>>> Executing @Before advice on method");
		
		// display the method signature
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("Method: " + methodSig);
		
		// display method arguments
		
		// get args
		Object[] args = theJoinPoint.getArgs();
		
		// loop thru args
		for(Object tempArg: args) {
			System.out.println(tempArg);
			
			if(tempArg instanceof Account) {
				// downcast and print Account specific stuff
				Account theAccount = (Account) tempArg;
				System.out.println("account name: " + theAccount.getName());
				System.out.println("account level: " + theAccount.getLevel());
			}
		}
	}
	
}
