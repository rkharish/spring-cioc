package com.sp.core.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Mario")
@Scope(value="singleton")
public class Mario {
	
	@Autowired
	private Tea tea;
	
	public Mario(){
		System.out.println("_____Mario is mario_____");
	}

	@Override
	public String toString() {
		return "Mario [tea=" + tea + "]";
	}

}
