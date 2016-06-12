/**
 * 
 */
package main.decorator.coffee.impl;

import main.decorator.coffee.parent.Coffee;

/**
 * @author 212426201
 *
 */
public class Latte extends Coffee {

	
	private String description = "Latte";

	public String getDescription() {
		return super.getDescription() + " " + description;
	}

	/**
	 * 
	 */
	public Latte() {
		// TODO Auto-generated constructor stub
		System.out.println("Created a Latte !");
	}

	/* (non-Javadoc)
	 * @see main.decorator.coffee.parent.Coffee#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("Cost of Latte is Fixed : 80!");
		return 80;
	}

}
