package com.model;

public class MMobile {
	private String vendorName;
	private String color;
	private float price;
	private Sim sim1;
	private Sim sim2;
	
	public MMobile() {
		
	}

	public MMobile(Sim sim1) {
		super();
		this.sim1 = sim1;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Sim getSim1() {
		return sim1;
	}

	public void setSim1(Sim sim1) {
		this.sim1 = sim1;
	}

	public Sim getSim2() {
		return sim2;
	}

	public void setSim2(Sim sim2) {
		this.sim2 = sim2;
	}

	@Override
	public String toString() {
		return "MMobile [vendorName=" + vendorName + ", color=" + color + ", price=" + price + ", sim1=" + sim1
				+ ", sim2=" + sim2 + "]";
	}

}
