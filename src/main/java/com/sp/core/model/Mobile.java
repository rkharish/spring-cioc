package com.sp.core.model;

import java.util.List;



/**
 * 
 * @author nagendra.yadav
 *
 */


public class Mobile  {
	
	private String name;
	private String color;
	private float price;
	private String size;
	private String weight;
	private Camera camera;
	private List<Sim> sims;
	
	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public List<Sim> getSims() {
		return sims;
	}

	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}

	public void fly(){
		System.out.println(")#()#(#(#((#(#(#==AHAHAH mobile is flying..............i3983939");
		System.out.println(")#()#(#(#((#(#(#==AHAHAH mobile is flying..............i3983939");
		System.out.println(")#()#(#(#((#(#(#==AHAHAH mobile is flying..............i3983939");
		System.out.println(")#()#(#(#((#(#(#==AHAHAH mobile is flying..............i3983939");
		System.out.println(")#()#(#(#((#(#(#==AHAHAH mobile is flying..............i3983939");
	}
		
	public Mobile(){
		System.out.println("|||||||||||<mobile default cons>|||||||||||||||");
	}
	

	public Mobile(String name, String color, float price, String size,
			String weight) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.size = size;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", price=" + price
				+ ", size=" + size + ", weight=" + weight + ", camera="
				+ camera + ", sims=" + sims + "]";
	}

	
}
