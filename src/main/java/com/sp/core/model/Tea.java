package com.sp.core.model;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Tea {
	private Date cDate = new Date();

	public Tea() {
		System.out.println("_____Tea is tea_____");
	}

	@Override
	public String toString() {
		return "Tea [cDate=" + cDate + "]";
	}
}
