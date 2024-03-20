import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int num = sc.nextInt();
        String[] inputStr = new String[num];
        for ( int i = 0; i < num; i++ ){
            inputStr[i] = sc.next();
        }

        for ( String str : inputStr ){

            System.out.println(str.substring(0,1) + str.substring( str.length() - 1 ));
        }

    }
}