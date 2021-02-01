import java.awt.*;

class TwoDRect extends Canvas
{
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
            g.fillRect(50, 20, 600, 500);
        
        g.setColor(Color.BLUE);
            int x[] = {100, 100, 350, 130, 310, 100};
            int y[] = {50, 500, 500, 270, 270, 50};
        g.drawPolygon(x, y, 6);

        g.setColor(Color.RED);
            g.fillPolygon(x, y, 6);

        g.setColor(Color.WHITE);
            g.fillOval(120, 370, 70, 70);
            g.drawArc(120, 100, 50, 100, 0, -180);
        
        g.setColor(Color.BLACK);
            g.drawString("My Nepal", 100, 570);
    }

    public static void main(String[] args) 
    {
        TwoDRect nf = new TwoDRect();

        Frame f = new Frame();

            f.setSize(800, 800);
            f.setVisible(true);
            f.add(nf);
    }
}