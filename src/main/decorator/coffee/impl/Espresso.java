/**
 * 
 */
package main.decorator.coffee.impl;

import main.decorator.coffee.parent.Coffee;

/**
 * @author Shashank
 *
 */
public class Espresso extends Coffee {
	
	private String description = "Espresso";

	public String getDescription() {
		return super.getDescription() + " " + description;
	}

	/**
	 * 
	 */
	public Espresso() {
		// TODO Auto-generated constructor stub
		System.out.println("Created an Espresso !");
	}

	/* (non-Javadoc)
	 * @see main.decorator.coffee.parent.Coffee#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("Cost of Latte is Fixed : 70!");
		return 70.0;
	}

}
