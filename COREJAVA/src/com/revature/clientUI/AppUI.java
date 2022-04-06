package com.revature.clientUI;

public class AppUI {
	/* This is static because we do not
	 * create an instance of this class
	 * just to call this simple print method.
	 */

	public static void printWelcomeMenu() {
		System.out.println("Welcome, user! What would you like to do?");
		System.out.println("1) View Cupcakes /n2)About" + "/n Please choose option 1 or 2");
	}

    public static void printBusinessInfo() {
    	System.out.println("this is the about me");
	
}
    public static void StopApp() {
    	System.out.println("This is the third option");
    }
}
