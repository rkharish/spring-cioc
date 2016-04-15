package com.it.autowire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.core.model.Laptop;

public class LaptopAutowireByType {
	
	public static void main(String[] args) {
		//Instantiating Spring container
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("laptop-byType.xml");
		 Laptop laptop=(Laptop)applicationContext.getBean("laptop");
	  	System.out.println("____LAPTOP Information is ____" + laptop);
		System.out.println("_________Charger_______________");
		System.out.println(laptop.getCharger());  //toString will be invoked!
	}

}
