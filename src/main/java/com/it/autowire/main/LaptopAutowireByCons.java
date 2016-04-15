package com.it.autowire.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.core.model.Laptop;



public class LaptopAutowireByCons {
  
	@Autowired
	public static void main(String[] args) {
		//Instantiating Spring container
		 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("laptop-byCons.xml");
		 Laptop laptop=(Laptop)applicationContext.getBean("laptop");
	  	System.out.println("____LAPTOP Information is ____" + laptop);
		System.out.println("_________Charger_______________");
		System.out.println(laptop.getCharger());  //toString will be invoked!
	}

}
