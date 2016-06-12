/**
 * Example for Decorator Design Pattern.
 * Concrete Implementations and Decorators have to be of this Class Type.
 */
package main.decorator.coffee.parent;

/**
 * @author Shashank
 *
 */
public abstract class Coffee {
	public Coffee(){
		System.out.println("Created Coffee !");
	}
 
	private String description= "Here is your Coffee :";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}
