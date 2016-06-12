/**
 * 
 */
package main.decorator.coffee.decorators.impl;

import main.decorator.coffee.decorators.Condiments;
import main.decorator.coffee.parent.Coffee;

/**
 * @author 212426201
 *
 */
public class Mocha extends Condiments {
	
	private Coffee coffee;
	
/*	public void setCoffee(Coffee coffee){
		this.coffee=coffee;
	}
	*/
	/**
	 * 
	 */
	public Mocha(Coffee coffee) {
		// TODO Auto-generated constructor stub
		System.out.println("Created Mocha !" + coffee);
		this.coffee=coffee;
	}

	/* (non-Javadoc)
	 * @see main.decorator.coffee.parent.Coffee#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = this.coffee.cost() + 20.0;
		System.out.println("Mocha: this.coffee.cost() = " + this.coffee + " " + this.coffee.cost());
		return cost;
	}

}
