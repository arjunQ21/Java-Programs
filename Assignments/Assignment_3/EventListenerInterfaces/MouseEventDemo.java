import java.awt.* ;
import java.awt.event.*;

class MouseListenerDemo extends Frame implements MouseListener{
	MouseListenerDemo(){
		Button b = new Button("Test mouse events") ;
		b.setBounds(20, 50, 300, 40) ;
		b.addMouseListener(this) ;
		b.addMouseMotionListener(new MouseMotionMethods()) ;
		add(b) ;
		setVisible(true) ;
		setSize(400, 400) ;
	}
	public void mousePressed(MouseEvent e){
		System.out.println("Mouse Pressed") ;
	}
	public void mouseReleased(MouseEvent e){
		System.out.println("Mouse Released") ;
	}
	public void mouseEntered(MouseEvent e){
		System.out.println("Mouse Entered") ;
	}
	public void mouseExited(MouseEvent e){
		System.out.println("Mouse Exited") ;		
	}
	public void mouseClicked(MouseEvent e){
		System.out.println("Mouse Clicked") ;		
	}
	public static void main(String[] args){
		new MouseListenerDemo() ;
	}
}
