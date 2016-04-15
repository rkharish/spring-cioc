package com.sp.core.model;

import java.util.Date;

public class Frog  {

	private String fid;
	private String name;
	private String color;
	
	public Frog getInstance(){
		Frog frog=new Frog("F92393","Tiky","green");
		return frog;
	}
	
	public Frog(String fid, String name, String color) {
		System.out.println("____ahaha really I understand constructor injection.............");
		this.fid = fid;
		this.name = name;
		this.color = color;
	}

	public Frog(){
		System.out.println("___frog is born at "+new Date());
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
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

	@Override
	public String toString() {
		return "Frog [fid=" + fid + ", name=" + name + ", color=" + color + "]";
	}

}
