/**
 * 
 */
package main.memento;

public class Originator {
	   private String state;

	   public void setState(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }

	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   public String getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	      return state;
	   }
	}