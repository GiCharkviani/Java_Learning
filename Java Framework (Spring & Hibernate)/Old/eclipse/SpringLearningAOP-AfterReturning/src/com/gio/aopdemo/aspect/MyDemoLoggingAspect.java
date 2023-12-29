package com.gio.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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