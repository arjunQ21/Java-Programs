import java.awt.* ;
import java.applet.* ;

/*
<applet code='AppletTest' height='200' width='200'></applet>
*/

public class AppletTest extends Applet{

    public void init(){
        setBackground(Color.black);
        setForeground(Color.green);
    }

    public void paint(Graphics g){
        g.drawString("Hi there", 20, 20) ;
    }
    
}