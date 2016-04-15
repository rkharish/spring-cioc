package com.sp.core.model;

import org.springframework.stereotype.Component;

@Component
public class Apple extends Fruit {
	private String taste="sour";

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Apple [taste=" + taste + ", getColor()=" + getColor() + "]";
	}

}
