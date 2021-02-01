import java.awt.* ;
import java.awt.event.* ;

class ButtonApp extends Frame implements ActionListener{
    ButtonApp(){
        Button[] buttons = new Button[3] ;
        buttons[0] = new Button("red") ;
        buttons[1] = new Button("blue") ;
        buttons[2] = new Button("green") ;


        setLayout(new FlowLayout()) ;
        setSize(400, 400) ;
        setTitle("Button Applet to App") ;
        setVisible(true) ;
        for( Button b: buttons) {
            add(b) ;
            b.addActionListener(this) ;
            // add(buttons[i]) ;
            // buttons[i].addActionListener(this) ;
        }
    }

    public void actionPerformed(ActionEvent event){
        String command = event.getActionCommand() ;
        System.out.println(command) ;
        switch(command){
            case "blue":
                setBackground(Color.blue) ;
                 break;
            case "red":
                setBackground(Color.red) ;
                 break;
            case "green":
                setBackground(Color.green) ;
                 break;
        }

    }

    public static void main(String[] args){
        new ButtonApp() ;
    }
}