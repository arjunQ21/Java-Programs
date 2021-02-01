import java.awt.* ;
import java.awt.event.*;

class ActionListenerDemo extends Frame implements ActionListener{
	ActionListenerDemo(){
		Button b = new Button("Click Me") ;
		b.addActionListener(this) ;
		add(b) ;
		setVisible(true) ;
		setSize(400, 400) ;
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("Button Clicked") ;
	}
	public static void main(String[] args){
		new ActionListenerDemo() ;
	}
}
