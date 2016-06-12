package test.decorator.coffee;

import main.decorator.coffee.decorators.impl.ExtraMilk;
import main.decorator.coffee.decorators.impl.Mocha;
import main.decorator.coffee.impl.Latte;
import main.decorator.coffee.parent.Coffee;

/**
 * @author 212426201
 *
 */
public class TestCoffee {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee1 = new Latte();
		/*coffee1 = new Mocha(coffee1);
		coffee1 = new Mocha(coffee1);
		coffee1 = new Mocha(coffee1);*/
		coffee1 = new ExtraMilk(coffee1);
		coffee1 = new ExtraMilk(coffee1);
		System.out.println("Total Cost = " + coffee1.cost());

	}

}
