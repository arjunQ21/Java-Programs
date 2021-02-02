import java.io.* ;
import java.net.* ;
import java.util.* ;

class Client{
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("127.0.0.1", 80) ;
        InputStream input = s.getInputStream() ;
        OutputStream output = s.getOutputStream() ;
        PrintWriter out = new PrintWriter(output) ;
        out.print("5\n") ;
        out.flush() ;
        Scanner in = new Scanner(input) ;
        while(in.hasNextLine()){
            System.out.println("Server says: "+in.nextLine()) ;
        }
    }
}