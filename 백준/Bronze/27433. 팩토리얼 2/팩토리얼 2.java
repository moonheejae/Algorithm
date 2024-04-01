import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;

        if( num >= 0 ){

            if ( num == 0 || num == 1) {
                factorial = BigInteger.ONE;

            } else if(num > 1){

                for ( int i = num; i > 1; i-- ){
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
            }
            System.out.println(factorial);

        }

    }
}
