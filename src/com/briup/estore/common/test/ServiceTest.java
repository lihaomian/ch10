package com.briup.estore.common.test;

import com.briup.estore.bean.Customer;
import com.briup.estore.service.ICustomerService;
import com.briup.estore.service.impl.CustomerServiceImpl;

public class ServiceTest {
	public static void main(String[] args) {
		ICustomerService customerService = new CustomerServiceImpl();
		customerService.register(new Customer(null, "李四", "123321", 12, "18898761234"));
	}
}
