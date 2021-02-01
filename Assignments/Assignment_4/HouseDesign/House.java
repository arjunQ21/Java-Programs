import java.awt.* ;
import java.awt.event.* ;
class House extends Frame{
	House(){



		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("Close Button Clicked") ;
				dispose() ;
			}
		});
		setSize(600, 600) ;
		setVisible(true) ;
	}
	public void paint(Graphics g){
		int x[] = {40, 230, 420} ;
		int y[] = {200, 100, 200} ;
		g.drawPolygon(new Polygon(x, y, 3)) ;
		g.setColor(new Color(60, 179, 113)) ;
		g.fillPolygon(new Polygon(x, y, 3)) ;
		g.setColor(Color.WHITE);
		g.fillOval(210, 130, 50, 50) ;
		g.drawRect(80, 200, 300, 200 ) ;
		g.setColor(Color.BLUE) ;
		g.fillRect(80, 200, 300, 200) ;
		g.setColor(new Color(60, 179, 113)) ;
		g.setColor(Color.GREEN) ;
		g.fillRect(120, 250, 50, 80 ) ;
		g.fillRect(290, 250, 50, 80 ) ;
		g.setColor(Color.ORANGE) ;
		g.fillRect(205, 250, 40, 140) ;
		// g.drawLine(2, 2, 2, 90) ;
	}
	public static void main(String[] args){
		new House() ;
	}
}