package com.sp.core.model;

import java.util.Date;

import org.springframework.beans.factory.BeanNameAware;

public class Dog implements BeanNameAware{

	private String beanId;
	private String name;
	private String color;
	private Date dob;
	static int count=1;
	public Dog() {
		System.out.println("____Dog bean is created_____"+count);
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	
	@Override
	public String toString() {
		return "Dog [beanId=" + beanId + ", name=" + name + ", color=" + color
				+ ", dob=" + dob + "]";
	}

	public void setBeanName(String name){
		beanId=name;
	}



}
