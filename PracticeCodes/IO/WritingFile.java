import java.util.Formatter ;
import java.io.* ;

class WritingFile{
    public static void main(String[] a) throws IOException
    {
        Formatter writer = new Formatter(new File("test.txt")) ;
        for(String text: a){
            // System.out.println(text);
            writer.format("%s\n", text) ;
        }
        writer.close();
    }
}