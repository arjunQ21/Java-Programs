import java.io.* ;


class ReadingAndWriting {
    public static void main(String[] agrs)throws IOException{
        FileInputStream fi = new FileInputStream("ReadingAndWriting.java") ;
        FileOutputStream fo = new FileOutputStream("test.txt") ;
        int readByte = 0 ;
        while(true){
            readByte = fi.read() ;
            if(readByte == -1) break ;
            fo.write(readByte) ;
        }
        System.out.println("Copied") ;
    }
}