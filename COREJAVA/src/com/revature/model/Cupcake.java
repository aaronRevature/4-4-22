package com.revature.model;

import java.util.Objects;

import java.util.Scanner;
import com.revature.clientUI.*;

/* My cupcake class model is a blueprint
 * the properties of a cupcake (cost, bakery, type, Etc.)
 * 
 */
/* We made this class a java bean. Java bean is a design pattern
 * A java bean includes 
 * a constructor using fields.
 *  A no args constructor
 *  Getters and Setters
 *  A hashcode method
 *  an equals method
 *  a toString method
 *  Serializable
 *  
 *  
 * Note also that we have made Cupcake a Dessert.
 * it inherits properties from Dessert.
 */
public class Cupcake extends Dessert {
	/*
	 * These are instance variables They are accessible through entire class The
	 * default values are the simplest possible. Object types are null by default.
	 * Primitive data types (boolean, byte, char, short, long, int, float, double)
	 * 
	 * please pay attention to the access modifiers these control the access to
	 * variables and methods. public is the most accessible
	 * 
	 * protected is very accessible in that it allows for direct access from within
	 * the same package and subclasses of this type (Cupcake)
	 * 
	 * default is less accessible, only accessible for access within the package. It
	 * is often called package private.You can not write "default", you have to
	 * exclude a modifier completely to access it.
	 * 
	 * private is the most restricted modifier. It only allows for direct access to
	 * a member from within the class.
	 * 
	 * 
	 */

	private String cupcakeFlavor;
	private String bakery;
	private short cost;

	public Cupcake() {
		/*
		 * This is always implied to be the first line of any Constructor
		 */
		super();
	}
	/*
	 * this is an overload of our constructor that uses the class's fields.
	 */

	public Cupcake(String cupcakeFlavor, short cost, String bakery) {
		this.cupcakeFlavor = cupcakeFlavor;
		this.cost = cost;
		this.bakery = bakery;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * in order to provide indirect access we use getters and setters. These are
		 * just methods that allows users to read or write from fields. We have now
		 * stored all cupcakes in our array
		 */

/* need to get the user input now
 * 
 */
Cupcake[] cupcakes = { new Cupcake("Champagne Cake", (short) 3, "Sugar Bee Sweets"),
		new Cupcake("Chocolate Cake", (short) 2, "Sugar Bee Sweets"),
		new Cupcake("Strawberry Cake", (short) 2, "Sugar Bee Sweets"),
		new Cupcake("Pecan Cake", (short) 2, "Sugar Bee Sweets") };

boolean isUserInterested = true;
int userSelection = scanner.nextInt();
scanner.nextLine();
LOOP1: while(isUserInterested) {
AppUI.printWelcomeMenu();


switch(userSelection) {
case 1:
	for (Cupcake cupcake: cupcakes) {
		System.out.println(cupcake);
	}
	break;
case 2:
	AppUI.printBusinessInfo();
	break;
case 3:
	AppUI.StopApp();
	isUserInterested = false;
	break LOOP1;
	
}
    scanner.close();
    
   
    if(userSelection == 1) {
    
			/*for(Cupcake cupcake : cupcakes) {
				System.out.println(cupcakes);}
				*/
				 for (int i = 0; i < cupcakes.length; i++) {
			System.out.println(cupcakes[i]);
				 
    }
    }
    else if (userSelection == 2) {
    		System.out.println("about");}}
    	
	}
	
		/*for (int i = 0; i < cupcakes.length; i++) {
			System.out.println(cupcakes[i]);
		}

	*/

	public String getCupcakeFlavor() {
		return cupcakeFlavor;
	}

	/*
	 * exam topic
	 * 
	 */
	public void setCupcakeFlavor(String cupcakeFlavor) {
		this.cupcakeFlavor = cupcakeFlavor;
	}

	public String getBakery() {
		return bakery;
	}

	public void setBakery(String bakery) {
		this.bakery = bakery;
	}

	public short getCost() {
		return cost;

	}

	public void setCost(short cost) {
		this.cost = cost;
	}

	public String toString() {
		return "Cupcake [ cupcakeFlavor= " + cupcakeFlavor + ", cost= " + cost + ", bakery= " + bakery + "]";

	}

	@Override
	public int hashCode() {
		return Objects.hash(bakery, cost, cupcakeFlavor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cupcake other = (Cupcake) obj;
		return Objects.equals(bakery, other.bakery) && cost == other.cost
				&& Objects.equals(cupcakeFlavor, other.cupcakeFlavor);
	}

	

	
}
