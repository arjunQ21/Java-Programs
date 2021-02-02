import java.awt.* ;
import java.awt.event.* ;

class Menus extends Frame{
    Menus(){
        super("Menus Demo") ;
        MenuBar menuBar = new MenuBar() ;
        setMenuBar(menuBar) ;

// Lets make a multidimensinal array in which the first element
// in array is the name of Menu,and other 
// following elements are the MenuItems

        String[][] menus = {
            {"file", "open", "close", "-", "quit"},
            {"edit", "cut", "copy", "-", "paste"},
            {"special", "first", "second", "third"}
        };

        int i, j ;
        for(i = 0 ; i < 3; i++){
            Menu m = new Menu(menus[i][0]) ;
            for(j = 1 ; j < menus[i].length; j++){
                m.add(new MenuItem(menus[i][j])) ;
            }
            menuBar.add(m) ;
        }

        setSize(400, 400) ;
        setVisible(true) ;
        addWindowListener(new WindowCloser(this)) ;

    }
    public static void main(String[] args){
        new Menus() ;
    }
}

class WindowCloser extends WindowAdapter{

    Frame frame ;

    WindowCloser(Frame aFrame){
        this.frame = aFrame ;
    }

    public void windowClosing(WindowEvent we){
        System.out.println("Closing now") ;
        frame.setVisible(false) ;
        System.exit(1) ;
    }
}