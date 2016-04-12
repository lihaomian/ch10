package com.briup.estore.bean;

/**
 * 顾客类
 * 顾客类是创建顾客对象的模板，顾客对象是用来保存顾客信息的
 * orm
 * Object  --  Relatation
 * 
 * */
public class Customer {
	private Long id;
	private String name;
	private String password;
	private Integer age;
	private String telephone;

	/**
    */
	public Customer() {

	}
	
	public Customer(Long id, String name, String password, Integer age,
			String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.telephone = telephone;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
