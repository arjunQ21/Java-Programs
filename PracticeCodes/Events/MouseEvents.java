import java.awt.* ;
import java.awt.event.* ;

class MouseEvents extends Frame implements MouseListener, MouseMotionListener
{
    String mouseEventStatus ;
    Point clickPoint ;
    TextField displayedText ;
    // Panel panel ;



    MouseEvents(){
        mouseEventStatus = "No Event Yet" ;
        clickPoint = new Point(200, 200) ;
        
    
        displayedText = new TextField() ;
        setDisplayText( mouseEventStatus, clickPoint) ;
        addMouseListener(this) ;
        addMouseMotionListener(this) ;
        setLayout(new FlowLayout()) ;
        add(displayedText) ;
        setSize(400, 400) ;
        setVisible(true) ;
    }

    public void setDisplayText( String text, Point point){
        displayedText.setText(text) ;
        displayedText.setBounds(point.x, point.y, 200, 60) ;
        // return TextField ;
    } 

    public static void main(String[] args){
        new MouseEvents() ;
    }

    public void mousePressed(MouseEvent e){
        setDisplayText("Pressed", e.getPoint()) ;
    }

    public void mouseClicked(MouseEvent e){
        // setDisplayText("Clicked", e.getPoint()) ;
    }

    public void mouseEntered(MouseEvent e){
        // setDisplayText("Entered", e.getPoint()) ;

    }

    public void mouseExited(MouseEvent e){
// setDisplayText("Exited", e.getPoint()) ;
    }

    public void mouseReleased(MouseEvent e){
// setDisplayText("Released", e.getPoint()) ;
    }

    public void mouseDragged(MouseEvent e){
        setDisplayText("Dragging", e.getPoint()) ;

    }

    public void mouseMoved(MouseEvent e){
    }

}