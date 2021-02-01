Anonymous Arrays in Java
========================

Arrays without a name is an anonymous array. These types of arrays are created for using just once. They are usually passed as arguments to methods.

    class Test{
      public void showArray(int a[]){
        System.out.println("Array items: ") ;
        int index = 0 ;
        for(int cur: a){
            System.out.println("[" + index++ + "] => " + cur ) ;
          }
      }
      
      public static void main(String args[]){
        Test t = new Test() ;
        t.showArray(new int[]{5, 6, 4, 3, 5, 6}) ;
      }
    
    }
