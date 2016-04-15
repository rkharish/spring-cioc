package com.spring.annotation;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Sim;

public class SimDaoMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sim id");
		String simid=scanner.next();
		Sim sim=new Sim();
		 sim.setSid(simid);
		 sim.setColor("white");
		 Timestamp timestamp=new Timestamp(new Date().getTime());
		 sim.setDom(timestamp);
		 sim.setDoe(timestamp);
		 sim.setDescription("New Sim is added");
		 sim.setImage(null);
		 sim.setMemory("12MB");
		 sim.setPrice(2019);
		 sim.setVendor("Airtel");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("anno/sim-dao.xml");
		ISimDao iSimDao=(ISimDao)applicationContext.getBean("simDao");
		iSimDao.persistSim(sim);
		System.out.println("Hey I understand example of annotation now!!!!!!!!!");
	}
}
