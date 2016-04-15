package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMobileWithSpring {
	public static void main(String[] args) {
		//create Spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mobile.xml");
		//mob1 ,mob2 , mob3 are three different bean with same state
		Mobile  mob1=(Mobile)applicationContext.getBean("mobile1");
		Mobile  mob2=(Mobile)applicationContext.getBean("mobile2");
		Mobile  mob3=(Mobile)applicationContext.getBean("mobile3");
		System.out.println("mob1.hashCode()" +mob1.hashCode());
		System.out.println("mob2.hashCode()" +mob2.hashCode());
		System.out.println("mob3.hashCode()" +mob3.hashCode());
		System.out.println(mob1);
		System.out.println(mob2);
		System.out.println(mob3);
		int result=mob1.fact(7);
		System.out.println("Fact of = 7 is "+result );
}
}
