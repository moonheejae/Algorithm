  
import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

         String n = sc.next();
        String m = sc.next();

        long nl = Long.parseLong(n);
        long ml = Long.parseLong(m);


        System.out.println(nl * ml / 2);
    }
}