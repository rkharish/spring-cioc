package com.model;

import java.sql.Timestamp;
import java.util.Arrays;

public class Sim {
	private String sid;
	private String vendor;
	private float price;
	private byte[] image;
	private String color;
	private String memory;
	private String description;
	private Timestamp dom;
	private Timestamp doe;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public Timestamp getDom() {
		return dom;
	}

	public void setDom(Timestamp dom) {
		this.dom = dom;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDoe() {
		return doe;
	}

	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	@Override
	public String toString() {
		return "Sim [sid=" + sid + ", vendor=" + vendor + ", price=" + price + ", image=" + Arrays.toString(image)
				+ ", color=" + color + ", memory=" + memory + ", description=" + description + ", dom=" + dom + ", doe="
				+ doe + "]";
	}

}
