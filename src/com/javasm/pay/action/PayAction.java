package com.javasm.pay.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javasm.pay.service.IPayService;
import com.javasm.pay.service.impl.AliPayServiceImpl;
import com.javasm.pay.service.impl.BaiduPayServiceImpl;
import com.javasm.pay.service.impl.WeixinPayServiceImpl;


public class PayAction {
	static ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String[] args) {
		IPayService AliPayService = context.getBean(AliPayServiceImpl.class);
		IPayService BaiduPayService = context.getBean(BaiduPayServiceImpl.class);
		IPayService weixinPayService = context.getBean(WeixinPayServiceImpl.class);
		AliPayService.pay();
		BaiduPayService.pay();
		weixinPayService.pay();
	}
}
