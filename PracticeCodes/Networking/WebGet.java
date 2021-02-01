import java.io.InputStream ;
import java.io.OutputStream ;
import java.io.IOException ;
import java.io.PrintWriter ;
import java.util.Scanner ;
import java.net.Socket;

class WebGet{
    public static void main(String[] args) throws IOException{
        String host;
        String URI ;
        if(args.length == 2){
            host = args[0] ;
            URI = args[1] ;
        }else if(args.length == 1){
            host = args[0] ;
            URI = "/" ;
        }else{
            // System.out.println("Missing host in command.") ;
            // System.exit(1) ;
            throw new IllegalArgumentException("missing host in command");
        }

        final int PORT = 80 ;
        Socket socket = new Socket(host, PORT) ;

        InputStream inStream = socket.getInputStream() ;
        OutputStream outStream = socket.getOutputStream() ;

        Scanner scanner = new Scanner(inStream) ;
        PrintWriter writer = new PrintWriter(outStream) ;

        String command = "GET "+ URI + " HTTP/1.1\n"
                        + "Host: " + host + "\n\n" ;

        writer.print(command) ;

        writer.flush() ;

        System.out.printf("\n\nResponse: \n") ;

        while(scanner.hasNextLine()){
            // String
            System.out.println(scanner.nextLine().toString()) ;
        }

        socket.close() ;
    } 
}