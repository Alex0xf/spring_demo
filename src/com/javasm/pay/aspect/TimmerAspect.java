package com.javasm.pay.aspect;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * ClassName: TimmerAspect
 * 
 * @Description: 用XML方式在spring中完成AOP
 * @author Alex
 * @date 2018年7月31日
 */
public class TimmerAspect {
	static Scanner sc = new Scanner(System.in);
	int num = 0;

	public void before() throws NumberFormatException, IOException {
		System.out.println("Time的前置:输入一个整型数字");
		num = Integer.parseInt(sc.next());
	}

	public void after() {
		System.out.println("Time后置"+num);
	}

	public void handleException() {
		System.out.println("输入不匹配");
		num = 1;
	}

	public void finallyMethod() {
		System.out.println("finallyMethod()被执行，num："+num);
	}
}
