package com.model.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.MMobile;

public class MMobileWithSpring {
	public static void main(String[] args) {
		//create Spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mmobile.xml");
		//mob1 ,mob2 , mob3 are three different bean with same state
		MMobile mobile=(MMobile)applicationContext.getBean("mmobile");
		System.out.println(mobile);
}
}
