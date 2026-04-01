package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String name, String color, double weight) {
		super(color, weight,name, true);
	}
	
	@Override
	public String taste() {
		return "sweet and sour" ;
	}
	
}
