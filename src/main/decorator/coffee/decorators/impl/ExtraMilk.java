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
public class ExtraMilk extends Condiments {
	
	private Coffee coffee;
	
	public void setCoffee(Coffee coffee){
		this.coffee=coffee;
	}
	
	/**
	 * 
	 */
	public ExtraMilk(Coffee coffee) {
		// TODO Auto-generated constructor stub
		System.out.println("Created  ExtraMilk !");
		this.coffee=coffee;
	}

	/* (non-Javadoc)
	 * @see main.decorator.coffee.parent.Coffee#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		System.out.println("ExtraMilk cost is 30 for now !");
		double cost = this.coffee.cost() + 30.0;
		System.out.println("ExtraMilk: this.coffee.cost() = " + this.coffee + " " + this.coffee.cost());
		return cost;
	}

}
