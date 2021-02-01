import javax.swing.JOptionPane ;
class TicTacToe{
    public static void main(String[] args){
        System.out.println("This is going to be a game soon.");
        String name = JOptionPane.showInputDialog("Enter Your Name: ") ;
        JOptionPane.showMessageDialog(null, "Your Name is "+ name) ;
    }
}