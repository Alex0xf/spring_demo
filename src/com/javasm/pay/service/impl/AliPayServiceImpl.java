package com.javasm.pay.service.impl;

import org.springframework.stereotype.Service;

import com.javasm.pay.service.IPayService;

@Service
public class AliPayServiceImpl implements IPayService {

	@Override
	public void pay() {
		System.out.println("AliPay");
	}
}
