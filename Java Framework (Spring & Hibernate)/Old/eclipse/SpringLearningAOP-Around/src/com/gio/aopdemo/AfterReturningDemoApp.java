package com.gio.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gio.aopdemo.dao.AccountDAO;
import com.gio.aopdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		

//		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("-----");
		
//		System.out.println(theAccounts);
		
		System.out.println("\n");

		
		// close the context
		context.close();
	}

}
