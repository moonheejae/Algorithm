 import java.util.*;


public class Main {
    public static int factorial( int N ){
        if ( N == 0 ) {
            return 1;
        }
        return N * factorial( N-1 );
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] in1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(in1[0]);
        int m = Integer.parseInt(in1[1]);

        int re = factorial(n) / (factorial(m) * factorial(n - m));
        System.out.println(re);
    }
}