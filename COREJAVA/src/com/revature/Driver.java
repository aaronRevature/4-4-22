//package declaration must be present

package com.revature;

/* If a type is in a different package it must be
 * imported. Must use fully qualified package name.
 */
import com.revature.model.Cupcake;
import com.revature.repository.CupcakeRepository;


public class Driver{
	
	public static void main(String[] args) {

		
		CupcakeRepository cupcakeRepository = new CupcakeRepository()
;       Cupcake[] cupcakes = cupcakeRepository.FindAllCupcakes();
		/*
		 * In order to create an instance of our 
		 * Cupcake class, we have used
		 * "new' keyword with class's constructor
		 */
System.out.println(cupcakes[0]);
 }
 
}
