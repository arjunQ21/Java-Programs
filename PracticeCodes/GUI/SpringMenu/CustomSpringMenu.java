import javax.swing.* ;
public class CustomSpringMenu {
    public static void main(String[] args){
        JMenuBar menuBar ;
        JMenu menu ;
        JMenuItem menuItem ;

        menuBar = new JMenuBar() ;

        menu = new JMenu("Open") ;
        menuItem = new JMenuItem("File") ;
        menu.add(menuItem) ;

        menuItem = new JMenuItem("Folder") ;
        menu.add(menuItem) ;

        menu.addSeparator();

        menuBar.add(menu) ;
        JFrame frame = new JFrame("Menu demo") ;
        frame.setJMenuBar(menuBar) ;
        frame.setSize(500, 400) ;
        frame.setVisible(true);

    }
}