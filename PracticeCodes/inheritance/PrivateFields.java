class A{
    private int privateInA ;

    A( int a){
        privateInA = a ; 
    }

    void show(){
        System.out.println("From A, a = " + privateInA) ;
    }
}

class B extends A{
    B(int a){
        super(a) ;
    }
    // void show(){
        // System.out.println("From b, a = " + privateInA) ;
    // }
}

class PrivateFields{
    public static void main(String[] args){
        B a = new B(4) ;
        a.show() ;
    }
}