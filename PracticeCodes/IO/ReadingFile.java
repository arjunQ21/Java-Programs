import java.io.File ;
import java.io.IOException ;
import java.util.Scanner ;
import java.util.Formatter ;

class ReadingFile{
    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(System.in) ;

        Formatter shower = new Formatter(System.out) ;
        shower.format("Enter file name: ") ;
        String fileName  = reader.nextLine() ;
        File inputFile = new File(fileName) ;
        Scanner input = new Scanner(inputFile) ;
        

        shower.format("Reading from file '%s': \n\n", fileName) ;

        while(input.hasNextLine()){
            shower.format("%s\n", input.nextLine());
        }
    }
}