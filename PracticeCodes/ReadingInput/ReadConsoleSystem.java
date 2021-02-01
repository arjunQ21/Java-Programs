import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadConsoleSystem {
 public static void main(String[] args) {

 int age;

 System.out.println("Enter your age : ");

    try{
       BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
       
       //Reading single input line as string
        String input = bufferRead.readLine();

        //parsing read string to desired data type, here to integer
        age = Integer.parseInt(input);


        System.out.println("Your age is: " + age);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

  }
}