
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        int list[] = new int[31];
        for ( int i = 0; i < 28; i++ ){

            list[ sc.nextInt() ] ++;
        }



        for (int i = 1; i < 31; i++ ) {
            if( list[i] == 0 ) {
                System.out.println( i );
            }


        }
    }
}