package com.tnsif.DI;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
@Component 
@Scope(value = "prototype")
public class Customer1 {
	private  String name;
	private int cid;
	
	public Customer1(){
		System.out.println("Customer 1 has been called");//constructor is created
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	void show() {
		System.out.println("this is from customer 1");
	}
	

}
