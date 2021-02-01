class WithoutNew{
    // this is run whenever new instance of this class is created.
    public WithoutNew(){
        System.out.println("New instance created.") ;
    }
}

class Demo{
    public static void main(String[] args){
        // using new Keyword

        WithoutNew instance1 = new WithoutNew() ;

        // Without using new keyword
        //We can make an object of type class, that stores the class's declaration, and we can use that object to create new instances from that class, without using the 'new' keyword

        // Class<WithoutNew> classRef = WithoutNew.class ;
        Class classRef = Class.forName("WithoutNew") ;
        WithoutNew instance2 = (WithoutNew) classRef.newInstance() ;
    }

}