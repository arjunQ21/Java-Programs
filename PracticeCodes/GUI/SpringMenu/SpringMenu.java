// package jmenudemo;
 
import javax.swing.*;
import java.awt.event.*;
 
public class SpringMenu {
 
    public static JMenuBar createMenuBar() {
 
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rdmi;
        JCheckBoxMenuItem cbmi;
 
        //Create the menu bar.
        menuBar = new JMenuBar();
 
        //Build the File Menu.
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menu.getAccessibleContext().setAccessibleDescription("Dealing with Files");
        menuBar.add(menu);
 
        //a group of JMenuItems
        menuItem = new JMenuItem("New Project...",
                new ImageIcon("images/newproject.png"));
        menuItem.setMnemonic(KeyEvent.VK_P);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "New Project");
        menu.add(menuItem);
 
        menuItem = new JMenuItem("New File...",
                new ImageIcon("images/newfile.png"));
        menuItem.setMnemonic(KeyEvent.VK_F);
        menu.add(menuItem);
 
        //a group of check box menu items
        menu.addSeparator();
        cbmi = new JCheckBoxMenuItem("A check box menu item");
        cbmi.setMnemonic(KeyEvent.VK_C);
        menu.add(cbmi);
 
        cbmi = new JCheckBoxMenuItem("Another one");
        cbmi.setMnemonic(KeyEvent.VK_H);
        menu.add(cbmi);
 
        //a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rdmi = new JRadioButtonMenuItem("Radio button menu item");
        rdmi.setSelected(true);
        rdmi.setMnemonic(KeyEvent.VK_R);
        group.add(rdmi);
        menu.add(rdmi);
 
        rdmi = new JRadioButtonMenuItem("Another radio button");
        rdmi.setMnemonic(KeyEvent.VK_O);
        group.add(rdmi);
        menu.add(rdmi);
 
        //a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);
 
        menuItem = new JMenuItem("Menu item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);
 
        menuItem = new JMenuItem("Another menu item");
        submenu.add(menuItem);
        menu.add(submenu);
 
        //Build Edit menu in the menu bar.
        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_E);
        menu.getAccessibleContext().setAccessibleDescription(
                "Edit Menu");
        menuBar.add(menu);
        return menuBar;
 
    }
 
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Menu Demo");
        frame.setJMenuBar(createMenuBar());
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}