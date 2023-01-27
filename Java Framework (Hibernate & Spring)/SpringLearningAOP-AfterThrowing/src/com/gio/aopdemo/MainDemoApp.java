package com.gio.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gio.aopdemo.dao.AccountDAO;
import com.gio.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		
		// call the business method
		Account myAccount = new Account("Gio's accont", "my level is high");
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		theAccountDAO.setName("Gio");
		theAccountDAO.getName();
		theAccountDAO.setServiceCode("Services");
		theAccountDAO.getServiceCode();
		
		
		theMembershipDAO.addAccount();
		theMembershipDAO.goToSleep();
		
		// close the context
		context.close();
	}

}
