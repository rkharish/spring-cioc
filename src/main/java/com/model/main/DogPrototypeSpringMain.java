package com.model.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Dog;

public class DogPrototypeSpringMain {
	public static void main(String[] args) {
		//create Spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dog-prototype.xml");
		//mob1 ,mob2 , mob3 are three different bean with same state
		Dog doa=(Dog)applicationContext.getBean("tdog");
		System.out.println(doa);
		System.out.println("doa.hashCode() = "+doa.hashCode());
		System.out.println("_@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Dog doa1=(Dog)applicationContext.getBean("tdog");
		System.out.println(doa1);
		System.out.println("doa1.hashCode() = "+doa1.hashCode());
		System.out.println("_@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Dog doa2=(Dog)applicationContext.getBean("tdog");
		System.out.println(doa2);
		System.out.println("doa2.hashCode() = "+doa2.hashCode());
}
}
