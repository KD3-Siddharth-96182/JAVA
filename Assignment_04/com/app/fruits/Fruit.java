package com.app.fruits;

public abstract class Fruit {
	protected String color;
	protected String name;
	protected double weight;
	protected boolean isFresh;
	
	public Fruit() {}

	public Fruit(String color,double weight,String name,boolean isFresh){
		this.color=color;
		this.name=name;
		this.weight=weight;
		this.isFresh=isFresh;
	}
	public String getName() {
		return this.name;
	}
	public boolean isFresh() {
		return this.isFresh;
	}
	public void setIsFresh(boolean isFresh) {
		this.isFresh=isFresh;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Color=" + color + ", Weight=" + weight;
	}
	
	public abstract String taste();
	
}
