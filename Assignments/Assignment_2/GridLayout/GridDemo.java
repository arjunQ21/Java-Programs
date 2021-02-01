import java.awt.* ;

class GridDemo{
	public static void main(String[] args){
		Frame f = new Frame("Grid Layout Demo") ;
		Button buttons[] = new Button[9] ;
		int i = 1 ;
		for(Button button: buttons){
			button = new Button("Button " + i++) ;
			f.add(button) ;
		}
		f.setLayout(new GridLayout(3, 3, 20, 20));
		f.setSize(400, 400) ;
		f.setVisible(true) ;
	}
}