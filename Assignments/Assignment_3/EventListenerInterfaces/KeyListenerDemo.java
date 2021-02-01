import java.awt.* ;
import java.awt.event.*;

class KeyListenerDemo extends Frame implements KeyListener{
	KeyListenerDemo(){
		TextField t = new TextField("Enter something here") ;
		t.addKeyListener(this) ;
		add(t) ;
		setVisible(true) ;
		setSize(400, 400) ;
	}
	public void keyPressed(KeyEvent e){
		System.out.println("Key Pressed") ;
	}
	public void keyReleased(KeyEvent e){
		System.out.println("Key Released") ;
	}
	public void keyTyped(KeyEvent e){
		System.out.println("Key Typed") ;
	}
	public static void main(String[] args){
		new KeyListenerDemo() ;
	}
}
