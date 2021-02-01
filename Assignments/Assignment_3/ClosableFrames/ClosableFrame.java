import java.awt.* ;
import java.awt.event.*;

class ClosableFrame{
	public static void main(String[] args){
		Frame f = new Frame("This frame can be closed.") ;
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("Close Button Clicked") ;
				// System.exit(0) ;
				
				// or 
				f.dispose() ;
			}
		});
		f.setSize(300, 399) ;
		f.setVisible(true) ;
	}
}
