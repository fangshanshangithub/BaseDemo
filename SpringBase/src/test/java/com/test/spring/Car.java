package com.test.spring;

public class Car {
	private String bind;
	
	private String color;
	
	private String maxspeed;
	
	public Car() {
	}
	
	public Car(String bind, String color, String maxspeed) {
		this.bind = bind;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	public void driver(){
		System.out.println("the car is driver");
	}

	public String getBind() {
		return bind;
	}

	public void setBind(String bind) {
		this.bind = bind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(String maxspeed) {
		this.maxspeed = maxspeed;
	}

	@Override
	public String toString() {
		return "Car [bind=" + bind + ", color=" + color + ", maxspeed=" + maxspeed + "]";
	}
	
	
}
