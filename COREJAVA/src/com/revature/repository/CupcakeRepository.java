package com.revature.repository;

import com.revature.model.Cupcake;

/* this cupcake repository is my source of data converning 
 * records of the cupcakes we have in stock. I do not have
 * a connection to a DB right now so I will hav to have 
 * some sort of hardcoded array for the time being
 * 
 */

public class CupcakeRepository {
	
	/*grab the cupcakes
	 * 
	 */
private Cupcake[] cupcakes = new Cupcake[10];
//our first order is creating the array

public CupcakeRepository() {
	super();
	this.cupcakes[0] = new Cupcake("champagene Cake", (short)2, "sugar");
	this.cupcakes[1]= new Cupcake("Chocolate Cake", (short) 2, "Sugar Bee Sweets");
	this.cupcakes[2]= new Cupcake("Strawberry Cake", (short) 2, "Sugar Bee Sweets");
	this.cupcakes[3]= new Cupcake("Pecan Cake", (short) 2, "Sugar Bee Sweets") ;
}

/* 
 * Now that we have our constructor, lets think about methods that simulate
 * data access. For instance we know that we need to 
 * read from our array. Lets make a method that returns the array to the caller.		
 */
public Cupcake[] FindAllCupcakes() {
	return this.cupcakes;
}
}

