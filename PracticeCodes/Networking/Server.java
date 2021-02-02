import java.io.* ;
import java.net.* ;
import java.util.* ;

class Server{
    public static void main(String[] args)throws IOException{
        ServerSocket server = new ServerSocket(80) ;

        // while(true){
            Socket s = server.accept() ;
            System.out.println("New client connected") ;
        InputStream input = s.getInputStream() ;
        OutputStream output = s.getOutputStream() ;
        PrintWriter out = new PrintWriter(output) ;
        Scanner in = new Scanner(input) ;
        int fromClient  ;
        if(in.hasNext()){
            // fromClient = Integer.parseInt(in.nextInt()) ;
            fromClient = in.nextInt() ;
            System.out.println("Client says: " + fromClient) ;
            out.print("The square of "+ fromClient + " is: " + fromClient*fromClient) ;
            out.flush() ;
        }else{
            System.out.println("Client gives no input") ;
        }
        

    }
}