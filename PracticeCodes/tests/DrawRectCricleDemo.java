import java.applet.Applet;

class DrawRectCricleDemo extends Applet {
    Font font;

    public void init(){
        font = new Font("times new roman", FONT.BOLD, 18);
        setSize(1000, 1000);
    }

    public void paint(Graphics g){
        g.drawRect(50, 50, 100, 150);
        g.setColor(Color.BLACK);
        g.fillOval(80, 80, 30, 30);
        
        String str = "Circle and Rectangle";
        str.setFont(font);

        g.drawString(str, 50, 170);
    }

}