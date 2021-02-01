import java.awt.* ;
class FlowDemo{
	public static void main(String[] args){
		Frame f = new Frame("Flow Layout Demo") ;
		Button buttons[] = new Button[10] ;
		int i = 1 ;
		for(Button b: buttons){
			b = new Button("Flow Button "+ i++) ;
			f.add(b) ;
		}
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)) ;
		f.setSize(600, 600) ;
		f.setVisible(true) ;
	}
}