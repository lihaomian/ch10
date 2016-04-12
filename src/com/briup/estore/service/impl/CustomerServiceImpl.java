package com.briup.estore.service.impl;

import com.briup.estore.service.ICustomerService;
import com.briup.estore.common.exception.ServiceException;
import com.briup.estore.common.util.MD5;
import com.briup.estore.dao.CustomerDao;
import com.briup.estore.bean.Customer;

public class CustomerServiceImpl implements ICustomerService {
	public CustomerDao customerDao;

	/**
	 * 初始化对象 
     */
	public CustomerServiceImpl() {
		//初始化
		customerDao = new CustomerDao();
	}

	/**
	 * @param name
	 * @param password
	 * @return com.briup.estore.bean.Customer
	 * @throws com.briup.estore.common.exception.ServiceException
	 */
	public Customer login(String name, String password) throws ServiceException {
		return null;
	}

	/**
	 * 事务管理
	 * jdbc
	 * 注册
	 * 顺序图
	 * 	1. 判断该用户用户名在数据库中是否存在
	 *     如果存在不能注册
	 *     如果不存在在注册
	 *  2. 注册成功后初始化用户信息
	 *  	积分，等级
	 * 
	 * @param customer
	 */
	public void register(Customer customer) {
		//加密
		customer.setPassword(MD5.getMD5Str(customer.getPassword()));
		customerDao.save(customer);
	}
}
