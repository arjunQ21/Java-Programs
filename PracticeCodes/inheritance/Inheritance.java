class Parent{
    public String name ;
    Parent(){
        name = "Parent" ;
    }
    Parent( String n ){
        name = n ;
    }

    public void show(){
        System.out.println(name) ;
    }
}

class Child extends Parent {
    Child(){
        // super() ;
        super("test") ;
        // name = "CHILD" ;
     }
    //  Child(String arkoName){
    //      name = arkoName ;
    //  }
     public static void main(String[] args){
        Parent parent = new Parent() ;
        Child child = new Child() ;
        Parent parent2 = new Parent("Bipin") ;
        // Child child2 = new Child("Bhusal") ;
        child.show() ;
        parent.show() ;
    }

}
// class Inheritance{

// }