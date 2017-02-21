import java.util.*;
/**
 * Created by startyaya on 1/30/17.
 */

public class Splitting {
    Scanner s = new Scanner(System.in);
    public static String knights =
            " i am a boy "+
            "you are a girl";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    public static void main (String [] args){
        split("");
        split("\\W+");
        split("n\\W+");
    }
}
