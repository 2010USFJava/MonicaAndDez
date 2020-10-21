package com.beans;

public class Fruit {
	
	String color;
	String shape;
	boolean hasSeeds;
	
	public Fruit(String color, String shape, boolean hasSeeds) {
		super();
		this.color = color;
		this.shape = shape;
		this.hasSeeds = hasSeeds;
	}

	public Fruit() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public boolean isHasSeeds() {
		return hasSeeds;
	}

	public void setHasSeeds(boolean hasSeeds) {
		this.hasSeeds = hasSeeds;
	}
	
	
	
	

}
