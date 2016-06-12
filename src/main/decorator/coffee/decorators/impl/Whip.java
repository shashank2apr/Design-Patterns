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
public class Whip extends Condiments {
	
	private Coffee coffee;
	
	public void setCoffee(Coffee coffee){
		this.coffee=coffee;
	}
	
	/**
	 * 
	 */
	public Whip(Coffee coffee) {
		// TODO Auto-generated constructor stub
		System.out.println("Created Whip !");
		this.coffee=coffee;
	}

	/* (non-Javadoc)
	 * @see main.decorator.coffee.parent.Coffee#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = this.coffee.cost() + 40.0;
		System.out.println("Whip: this.coffee.cost() = " + this.coffee + " " + this.coffee.cost());
		return cost;
	}

}
