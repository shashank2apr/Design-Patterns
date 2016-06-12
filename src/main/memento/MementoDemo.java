/**
 * 
 */
package main.memento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author 212426201
 *
 */
public class MementoDemo extends JFrame{
	JPanel panel;
	JTextArea areaText;
	JButton saveBtn,undoBtn,redoBtn;
	int noOfStates,currStateNum;
	Originator orig=new Originator();
	CareTaker care=new CareTaker();
	
	public static void main(String[] args) {
		new MementoDemo();
	}
	
	public MementoDemo(){
		
		this.setSize(400, 400);
		this.setTitle("Undo-Redo-Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		panel.add(new JLabel("String : "));
		areaText=new JTextArea(20,20);
		panel.add(areaText);
		
		
		saveBtn =new JButton("Save");
		undoBtn =new JButton("Undo");
		redoBtn =new JButton("Redo");
		
		saveBtn.addActionListener(new ButtonListener());
		undoBtn.addActionListener(new ButtonListener());
		redoBtn.addActionListener(new ButtonListener());
		
		
		panel.add(saveBtn);
		panel.add(undoBtn);
		panel.add(redoBtn);
		this.add(panel);
		this.setVisible(true);
		
		
	
	}

class ButtonListener implements ActionListener {
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==saveBtn){
			
			String str=areaText.getText();
			
			orig.setState(str);
			
			care.add(orig.saveStateToMemento());
			
			noOfStates++;
			currStateNum++;
			System.out.println("SaveBtn: noOfStates = "+noOfStates);
			System.out.println("SaveBtn: currStateNum = "+currStateNum);
			undoBtn.setEnabled(true);
						
		} else if (e.getSource()==undoBtn){
			
			System.out.println("in UNDO");
			System.out.println("UndoBtn: currStateNum = "+currStateNum);
			System.out.println("UndoBtn: currStateNum>=1 = "+(currStateNum>=1));
			if(currStateNum>=1){
				
				currStateNum--;
				String memento = orig.getStateFromMemento(care.get(currStateNum));
				areaText.setText(memento);
				System.out.println("UndoBtn: noOfStates = "+noOfStates);
				System.out.println("UndoBtn: currStateNum = "+currStateNum);
				redoBtn.setEnabled(true);
			} else{
				undoBtn.setEnabled(false);
			}		
			
		} else{
			
			if((noOfStates-1) > currStateNum){
				
				currStateNum++;
				
				String memento=orig.getStateFromMemento(care.get(currStateNum));
				
				areaText.setText(memento);
				
				System.out.println("RedoBtn: noOfStates = "+noOfStates);
				System.out.println("RedoBtn: currStateNum = "+currStateNum);
				
				undoBtn.setEnabled(true);
				
			} else{
				redoBtn.setEnabled(false);
			}
			
		}
		
	}
	
}
}