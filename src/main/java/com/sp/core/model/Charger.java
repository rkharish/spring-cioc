package com.sp.core.model;

public class Charger {

	private String color;
	private String name;
	
	public Charger() {
		System.out.println("______________DC constructor for  Charger___________-");
	}
	
	public Charger(String color, String name) {
		super();
		this.color = color;
		this.name = name;
        System.out.println("______________PC constructor for  Charger___________-");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Charger [color=" + color + ", name=" + name + "]";
	}

}
