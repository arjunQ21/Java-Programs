import java.awt.* ;
import java.applet.* ;


/*
<applet code='FontDemo' height=400 width=400></applet>
*/

public class FontDemo extends Applet{
    
    public void paint(Graphics g){
    Font font = new Font("Times New Roman", Font.BOLD, 20) ;
    g.setFont(font) ;
    g.setColor(Color.blue) ;
    g.drawString("Pokhara University",20, 20) ;

    }
    

}