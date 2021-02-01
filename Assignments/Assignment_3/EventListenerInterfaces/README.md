Commonly Used Event Listener Interfaces
=======================================

# ActionListener
This interface deals with the action events. Following is the event handling method available in the ActionListener interface:

    void actionPerformed(ActionEvent e)

# KeyListener
Deals with key events
Available methods are:

    void keyPressed(KeyEvent e)
    void keyReleased(KeyEvent e)
    void keyTyped(KeyEvent e)

# MouseListener
Deals with mouse click events. Available methods are:

    void mouseClicked(MouseEvent e)
    void mousePressed(MouseEvent e)
    void mouseReleased(MouseEvent e)
    void mouseEntered(MouseEvent e)
    void mouseExited(MouseEvent e)

# MouseMotionListener
Deals with movement of mouse events.

    void mouseMoved(MouseEvent e)
    void mouseDragged(MouseEvent e)

#TextListener
This interface deals with the text events. Following is the event handling method available in the TextListener interface:

    void textValueChanged(TextEvent e)
