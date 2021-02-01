Inheritance in Interface in Java
================================

Just like the blueprint for a class can be extended from and existing class, the interfaces can also be extended from one or more existing interfaces.
The interitance of classes allow extending from a single class, whereas in case of interfaces, multiple interfaces can be inherited to a new interface.

    interface intA{
      void a() ;
    }
    
    interface intB{
      default void b(){
        System.out.println("Default method from interface B.") ;
      }
    }
    
    interface intC extends intA, intB{
      void c() ;
    }
    
    class TestClass implements intC{
      public void a(){
        System.out.println("From a() method in TestClass.") ;
      }
      public void c(){
        System.out.println("From c() method in TestClass.") ;
      }
      
      public static void main(String[] args){
        TestClass tc = new TestClass() ;
        tc.b() ;
      }
    }
    
    //  Output
    //  Default method from interface B.

