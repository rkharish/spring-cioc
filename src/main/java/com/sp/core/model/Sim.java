package com.sp.core.model;

public class Sim {

	private String sid;
	private String vendor;
	private String number;
	
	
	public void divya(){
		sid=100+"";
	}
	
	private Sim(){
		System.out.println("|_@)@)(@@)");
	}
	
	public static Sim getInstance(){
		Sim dd= new Sim();
		dd.setSid("E333");
		dd.setNumber("0394848");
		dd.setVendor("IDEA");
		return dd;
	}

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Sim [sid=" + sid + ", vendor=" + vendor + ", number=" + number
				+ ", getSid()=" + getSid() + ", getVendor()=" + getVendor()
				+ ", getNumber()=" + getNumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
