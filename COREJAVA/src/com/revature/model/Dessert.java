package com.revature.model;
/*
 * We will use this class as a base class for our shops desserts.
 * The idea is that cupcakes ( as well as ice cream and chocolate ) all have
 * some properties in common at the very least. That said we can use this base class to pass
 * on those properties to our more specific desserts. 
 */

public class Dessert {

	//providing base properties of desserts
	protected int calories;
	protected boolean isGlutenFree;
	protected boolean isVegan;
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public boolean isGlutenFree() {
		return isGlutenFree;
	}
	public void setGlutenFree(boolean isGlutenFree) {
		this.isGlutenFree = isGlutenFree;
	}
	public boolean isVegan() {
		return isVegan;
	}
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	
	
	
}
