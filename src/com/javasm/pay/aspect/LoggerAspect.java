package com.javasm.pay.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * ClassName: LoggerAspect
 * @Description: 记录支付的日志
 * @author Alex
 * @date 2018年7月31日
 */
@Component
@Aspect // 声明本类是一个切面
public class LoggerAspect {
	// 切入点
	// execution切入点的规则 第一位 是返回值类型*代表全部类型 第二位是方法的全路径 ..代表所有的参数都可以
	// @Pointcut("execution(* com.javasm.*.service.*.*(..))")
	
	@Pointcut("execution(* com.javasm.pay.service.IPayService.pay(..))")
	public void anyMethod(){
		//当前方法名字任意  目的是作为一个标记
	}
	
	@Before(value = "anyMethod()")
	public void beforeMethod(){
		System.out.println("this is beforeMethod");
	}
	
	@After("anyMethod()")
	public void afterMethod(){
		System.out.println("this is afterMethod");
	}
	
	@Around("anyMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		Long startTime=System.currentTimeMillis();
		System.out.println("环绕开始");
		Object o=pjp.proceed();
		Long endTime=System.currentTimeMillis();
		System.out.println("方法执行时间"+(endTime-startTime));
		System.out.println("环绕结束"+o);
	}
	
}
