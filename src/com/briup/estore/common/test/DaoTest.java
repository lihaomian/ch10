package com.briup.estore.common.test;

import com.briup.estore.bean.Customer;
import com.briup.estore.dao.CustomerDao;

public class DaoTest {
	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDao();
		customerDao.save(new Customer(null, "张三", "123321", 12, "18898761234"));
	}
	
}
