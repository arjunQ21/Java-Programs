class A{
    int x = 10;
}

class B{
    B(){
        System.out.println(x) ;
    }
}

class C{
    public static void main(String[] agrs){
        new B() ;
    }
}