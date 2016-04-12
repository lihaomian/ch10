package com.briup.estore.service;

import com.briup.estore.bean.Customer;
import com.briup.estore.common.exception.ServiceException;

public interface ICustomerService 
{
   
   /**
   @param name
   @param password
   @return com.briup.estore.bean.Customer
   @throws com.briup.estore.common.exception.ServiceException
    */
   public abstract Customer login(String name, String password) throws ServiceException;
   
   /**
   @param customer
    */
   void register(Customer customer);
}
