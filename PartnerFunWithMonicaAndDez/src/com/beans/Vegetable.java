package com.beans;

public class Vegetable {
	
	String color;
	String shape;
	boolean hasSeeds;
	
	
	
	public Vegetable(String color, String shape, boolean hasSeeds) {
		super();
		this.color = color;
		this.shape = shape;
		this.hasSeeds = hasSeeds;
	}



	public Vegetable() {
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



	@Override
	public String toString() {
		return "Vegetable [color=" + color + ", shape=" + shape + ", hasSeeds=" + hasSeeds + "]";
	}
	
	
	
}
