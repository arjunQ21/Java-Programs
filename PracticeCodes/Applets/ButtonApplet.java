import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ButtonApplet" height=400 width=400>
    <param name=choosen value=Green>
</applet>
 */

public class ButtonApplet extends Applet implements ActionListener
{
  Button rb, gb, bb;
  
  public void init()
  {
    setLayout(new FlowLayout());                       // for applet, FlowLayout is the default also
   
    rb = new Button("Red");          
    gb = new Button("Green");
    bb = new Button("Blue");

    rb.addActionListener(this);
    gb.addActionListener(this);
    bb.addActionListener(this);
    add(rb);  add(gb);  add(bb);                       // no set methods
  }
  public void start(){
    setBackgroundColor(getParameter("choosen")) ;

  }
  public  void actionPerformed(ActionEvent e)
  {
    setBackgroundColor(e.getActionCommand());
    
  
  }

    public void setBackgroundColor(String color){
        if(color.equals("Red"))
        setBackground(Color.red);    
        else if(color.equals("Green"))
        setBackground(Color.green);    
        else if(color.equals("Blue"))
        setBackground(Color.blue);  
    }

}                                                      