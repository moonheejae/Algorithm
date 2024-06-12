
import java.util.*;


public class Main {

    public static void main(String[] args)  {

  
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String [] input = new String[in.length()];
        for ( int i = 0; i < in.length(); i++ ){
            input[i] = in.substring(i, i+1);
        }
        String back = "";
        for ( int i = input.length-1; i >= 0; i-- ){
            back += input[i];
        }
        if( in.equals(back) ){
            System.out.println(1);}
        else {
            System.out.println(0);
        }

    }}