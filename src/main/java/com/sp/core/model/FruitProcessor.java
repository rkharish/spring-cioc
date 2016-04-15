package com.sp.core.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FruitProcessor {

	@Resource
	@Qualifier("mango")
	private Fruit apple;
	//private Fruit fruit;
	//private Fruit fruit;

	@Override
	public String toString() {
		return "FruitProcessor [apple=" + apple + "]";
	}

}
