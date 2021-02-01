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