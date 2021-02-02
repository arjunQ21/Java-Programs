import java.awt.* ;
import java.awt.event.* ;

class Adder extends Frame implements ActionListener{
    TextField[] textFields ;
    Button button ;
    Adder(){
        textFields = new TextField[3] ;
        textFields[0] = new TextField("1") ;
        textFields[1] = new TextField("2") ;
        textFields[2] = new TextField("3") ;
        button = new Button("Add");

        setLayout(new FlowLayout()) ;
        for(TextField t: textFields) add(t) ;
        button.addActionListener(this) ;
        add(button) ;
        setTitle("Adder") ;
        setSize(400, 400); 
        setVisible(true) ;
    }

    public static void main(String[] agrs){
        new Adder() ;
    }

    public void actionPerformed(ActionEvent e){
        int num1, num2 ;
        num1 = num2 = 0;
        try{
            num1 = Integer.parseInt(textFields[0].getText()) ;
            num2 = Integer.parseInt(textFields[1].getText()) ;
        }catch(Exception ex){}
        finally{
            textFields[0].setText(String.valueOf(num1)) ;
            textFields[1].setText(String.valueOf(num2)) ;
            textFields[2].setText(String.valueOf(num1 + num2)) ;
        }
        // System.out.println(num1);

    }
}