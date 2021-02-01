Adapter Classes in java
=======================

Java adapter classes provide the default implementation of listener interfaces. If you inherit the adapter class, you will not be forced to provide the implementation of all the methods of listener interfaces. So it saves code.

The "Listener" string from the listner interfaces can be replaced with "Adapter" string to get corresponding adapters for interfaces.

example, 

    for MouseListener interface, the Adapter class will be MouseAdapter

The example above "AdapterDemo.java" shows handling of key events, even when all the methods of KeyListener interface are not defined.