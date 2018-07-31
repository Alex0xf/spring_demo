package com.javasm.pay.service.impl;

import org.springframework.stereotype.Service;

import com.javasm.pay.service.IPayService;

@Service
public class BaiduPayServiceImpl implements IPayService{

	@Override
	public void pay() {
		System.out.println("BaiduPay");
	}

}
