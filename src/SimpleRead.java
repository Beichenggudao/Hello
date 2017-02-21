import java.io.*;

/**
 * Created by startyaya on 1/30/17.
 */
public class SimpleRead {
    public static BufferedReader input = new BufferedReader( new StringReader("Sir \n2561.3"));
    public static void main (String [] args ){
        try {
            String name = input.readLine();
            System.out.println(name);
            String number = input.readLine();
            System.out.println(number);

            String [] numArray = number.split("");
            int age = Integer.parseInt(numArray[0]);
            System.out.format("age: %d." ,age);
        }catch(IOException e){
            System.err.println("IO exception");
        }
    }
}
