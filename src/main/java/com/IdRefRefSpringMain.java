package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.core.model.Camera;
import com.sp.core.model.Mobile;

public class IdRefRefSpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//instantiating spring container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("idref-ref.xml");
		//I am accessing a bean from spring container which id=chungho
		Camera camera=(Camera)applicationContext.getBean("pcamera");
		System.out.println(camera);
		
		 camera=(Camera)applicationContext.getBean("nagendra");
		 System.out.println(camera);
	}

}
