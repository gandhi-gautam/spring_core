package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting samosa price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside Samosa Init");
	}

	public void destroy() {
		System.out.println("Inside Samosa Destroy");
	}
}
