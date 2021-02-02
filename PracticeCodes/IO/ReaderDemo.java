import java.io.* ;
import java.util.Scanner ;

class ReaderDemo{
    public static void main(String[] args) throws IOException{
        FileReader r = new FileReader("test.txt") ;
        BufferedReader  s = new BufferedReader(r) ;
        // while(s.hasNextLine()){
        //     System.out.println(s.nextLine()) ;
        // }
        // String str ;
        // while((str = s.readLine()) != null){
        //     System.out.println(str) ;
        // }
        int c ;
        while((c = r.read()) != -1){
            System.out.println((char)c) ;
        }
    }
}