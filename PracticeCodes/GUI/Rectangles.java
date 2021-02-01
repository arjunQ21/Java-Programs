import java.awt.* ;

class Rectangles extends Frame{
    public static void main(String[] args){
        new Rectangles() ;
    }
    Rectangles(){
        setSize(400, 400) ;
        setVisible(true) ;

    }
    public void paint(Graphics g){
        g.setColor(Color.cyan) ;
        g.drawRect(30, 30, 50, 50) ;
        g.fillRect(30, 110, 50, 50) ;
        g.drawRoundRect(30, 190, 50, 50, 12, 12) ;
        g.fillRoundRect(30, 270, 50, 50, 12, 12) ;
        g.fillArc(110, 30, 50, 50, 12, 270);
        int xPoints[] = {110, 110, 110, 160, 120, 160, 110} ;
        int yPoints[] = {80, 130, 180, 180, 130, 130, 80};
        g.drawPolygon(xPoints, yPoints, 7) ;
        g.setColor(new Color(0x22222222));
        g.fillRect(109, 79, 2, 140);
    }
}