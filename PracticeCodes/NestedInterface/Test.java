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