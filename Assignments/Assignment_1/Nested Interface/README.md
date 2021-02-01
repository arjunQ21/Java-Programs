Nested Interface in Java
========================

An interface declared inside another interface or class is known as nested interface. The nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It can't be accessed directly.

        //Syntax:
            //Nested Interface from Interface
            
            interface ParentIntf{
                ...
                interface ChildIntf{
                    ...
                }
            }
            
            //Nested Interface from Class
            
            class ClassName{
                ...
                interface ChildIntf{
                    ...
                }
            }
            
Using Nested Interface

                class A{
                        interface Sendable{
                                default void send(){
                                        System.out.println("Default send() method of A.Sendable interface.") ;
                                }
                        }
                }
                
                interface C{
                        public void c() ;
                        interface D{
                                public void d() ;
                        }
                }
                
                class B implements A.Sendable, C.D{
                        public void d(){
                                System.out.println("d() method defined in Class B") ;
                        }
                        public static void main(String[] args){
                                B obj = new B() ;
                                obj.send() ;
                                obj.d() ;
                        }
                }
                
                //Output: Default send() method of A.Sendable interface.
                          d() method defined in Class B
                
                
