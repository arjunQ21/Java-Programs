class A{
    public static void test(int a, int b){
        System.out.println("Called from A class.") ;
    }
}
class B extends A{
    public static void test(int a){
        System.out.println("Called from B class.") ;
    }
}
class Test{
    public static void main(String[] args){
        A a = new A() ;
        B b = new B() ;
        a.test(5, 4) ;
        b.test(4) ;
    }
}