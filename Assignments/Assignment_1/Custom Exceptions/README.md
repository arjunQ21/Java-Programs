Custom Exceptions in Java
=========================

The main Exception class can be extended to other new Exception classes, which can be used as per our needs.

    class CustomExc extends Exception{
      ...
    }
    
    class Test{
      public static void main(String[] args) throws CustomExc
      {
        ...
        if(...) throw new CustomExc() ;
        ...
        
      }
    }
