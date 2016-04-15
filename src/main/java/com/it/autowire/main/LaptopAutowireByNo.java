package com.it.autowire.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.core.model.Laptop;

public class LaptopAutowireByNo {
	
	public static void main(String[] args) {
		//Instantiating Spring container
		 ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("laptop-no.xml");
	     Laptop laptop=(Laptop)applicationContext.getBean("laptop");
	     System.out.println("____LAPTOP Information is ____" + laptop);
		 System.out.println("_________Charger_______________");
		 //this would come null
		 System.out.println(laptop.getCharger());  //toString will be invoked!
	}

}
