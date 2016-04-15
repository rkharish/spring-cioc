package com.sp.core.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public abstract class Master implements BeanNameAware,InitializingBean{
	private String beanId;
	private String name;
	// The bean which you want to make prototype
	// inside singleton bean. return it from
	// abstract method
	// The abstract method getNewDogInstance in type Master can only set a
	// visibility modifier, one of public or
	// protected
	abstract public Dog getNewDogInstance();
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("____post#########################################Construct_____");
	}
	
	public Master(){
		System.out.println("____Master bean is created_____");
	}
	
	//in Spring call method name not fixed..
	public void neelappa(){
		System.out.println("_@)@)(INIT IS CALLED FOR MASTER____");
		this.name="Mr. " +this.name.toUpperCase();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("########setter is called. for Name attribute.............");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Master [beanId=" + beanId + ", name=" + name + "]";
	}

	@Override
	public void setBeanName(String name){
		System.out.println(".............Setting the bean id inside the bean...................");
		System.out.println(".............Setting the bean id inside the bean...................");
		beanId=name;
	}
	
	public void afterPropertiesSet(){
		System.out.println("___afterPropertiesSet__________");
	}


}
