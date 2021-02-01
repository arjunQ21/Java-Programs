import java.awt.* ;

class Calculator extends Frame{
    Calculator(){
        String buttonTexts = "123+456-789x0./=";
        Button buttons[] = new Button[16];
        int i = 0 ;
        for(i = 0 ; i< 4; i++) add(new TextField());
        i = 0 ;
        for(Button b: buttons){
            b = new Button(buttonTexts.charAt(i++)+"");
            add(b);
        }
        setLayout(new GridLayout(5, 4));
        setVisible(true);
        setSize(300, 400);
    }
    public static void main(String[] args){
        new Calculator() ;
    }
}
