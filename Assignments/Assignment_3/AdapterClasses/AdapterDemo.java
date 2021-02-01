import java.awt.* ;
import java.awt.event.*;

class AdapterDemo extends Frame {
	AdapterDemo(){
		TextField t = new TextField("Enter something here") ;
		t.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				System.out.println("Key Typed") ;
			}
		}) ;
		add(t) ;
		setVisible(true) ;
		setSize(400, 400) ;
	}
	// public void keyPressed(KeyEvent e){
	// 	System.out.println("Key Pressed") ;
	// }
	// public void keyReleased(KeyEvent e){
	// 	System.out.println("Key Released") ;
	// }
	public static void main(String[] args){
		new AdapterDemo() ;
	}
}
