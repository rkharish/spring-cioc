package com.sp.core.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author nagendra.yadav
 * 
 *  1) all the attribute should be private
 *  2) It must have default constructor
 *  3) It must have getter and setter.
 *  
 */
public class Laptop {

	private String name;
	private String model;
	private String price;
	private String color;
	
	private Charger charger;
	private Dog dog;
	
	public Laptop(Charger charger, Dog dog) {
		super();
		this.charger = charger;
		this.dog = dog;
		System.out.println("Cons for dog and charger");
	}


	@PostConstruct
	public void killLaptop(){
		System.out.println("_@#)#)(#)(#)#))#)");
		System.out.println("_@#)#)(#)(#)#))#)");
		System.out.println("_@#)#)(#)(#)#))#)");
	}
	
	
	public void ishan() {
		name="mamamama";
	}
	
	//Who will inject this default constructor =compiler 
	public Laptop() {
		System.out.println("_____Laptop constructor is called__________---");
	}
	
	//This is called when autowire by cons is done!!!!!!!!!!!!!!!!!!!!
	public Laptop(Charger charger){
		this.charger=charger;
		System.out.println("//This is called when autowire by cons is done!!!!!!!!!!!!!!!!!!!!");
	}
	
	public Laptop(String name, String model, String price, String color) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
		System.out.println("Constructor with out Charger parameter.................................");
	}
	public Laptop(String name, String model, String price, String color,
			Charger charger) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
		this.charger = charger;
		System.out.println("Constructor with Charger parameter.................................");
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Laptop [name=" + name + ", model=" + model + ", price=" + price
				+ ", color=" + color + ", charger=" + charger + ", dog=" + dog
				+ "]";
	}

	

}
