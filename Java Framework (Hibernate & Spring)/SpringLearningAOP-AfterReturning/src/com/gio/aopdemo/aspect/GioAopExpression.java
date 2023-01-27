package com.gio.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class GioAopExpression {
	
	// @Pointcut used for sharing pointcut declaration
	@Pointcut("execution(* com.gio.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.gio.aopdemo.dao.*.get*())")
	public void getter() {}
	
	@Pointcut("execution(* com.gio.aopdemo.dao.*.set*(..))")
	public void setter() {}

	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
}
