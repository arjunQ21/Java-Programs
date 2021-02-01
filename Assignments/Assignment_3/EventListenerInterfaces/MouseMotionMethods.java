import java.awt.* ;
import java.awt.event.*;

class MouseMotionMethods implements MouseMotionListener{
	public void mouseMoved(MouseEvent e){
		System.out.println("Mouse Moved") ;
	}
	public void mouseDragged(MouseEvent e){
		System.out.println("Mouse Dragged") ;
	}
}
