package com.springcore.lifecycle;

public class Samosa {
private int price;
public int getPrice() {
	return price;
}

public void setPrice(int price) {
	System.out.println("indide set price");
	
	this.price = price;
}
public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init() {
	System.out.println("Inside init method");
	
}
public  void destroy() {
	System.out.println("inside destroy method");
}
}
