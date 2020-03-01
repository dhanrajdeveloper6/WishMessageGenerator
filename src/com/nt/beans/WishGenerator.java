package com.nt.beans;

import java.util.Date;

public class WishGenerator {

	//bean property 
	private Date date;
	private String name;
	
	public WishGenerator() {
		System.out.println("WishGenerator-0-param Constructor");
	}
	
	public void setName(String name) {
		this.name= name;
		
	}
	public void setDate(Date date) {
		System.out.println("WishGenerator:setDate(-)");
		this.date = date;
		
	}
	
	//B method
	public String generateWishMsg() {
		return "Good Morning"+name+"...."+date;
	}
}

