import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        int a = sc.nextInt();
        int b = sc.nextInt();


            String result = "";
          if ( a * b > 0 ) {
              result = a<0 ? "3" : "1";
          } else {
              result = a<0 ? "2" : "4";
          }
        System.out.println(result);




    }
}