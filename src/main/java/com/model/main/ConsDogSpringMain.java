package com.model.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Dog;

public class ConsDogSpringMain {
	public static void main(String[] args) {
		//create Spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dog.xml");
		//mob1 ,mob2 , mob3 are three different bean with same state
		Dog doa=(Dog)applicationContext.getBean("tdog");
		System.out.println(doa);
}
}
