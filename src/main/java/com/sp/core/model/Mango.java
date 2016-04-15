package com.sp.core.model;

import org.springframework.stereotype.Component;

@Component
public class Mango  extends Fruit{
	private String taste="sweet";

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Mango [taste=" + taste + ", getColor()=" + getColor() + "]";
	}
}
