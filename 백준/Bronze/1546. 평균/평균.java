import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        int subjectNum = sc.nextInt();

        int max = -1;
        int value = 0;
        double sum = 0;

        for ( int i = 0; i < subjectNum; i++ ){

            value = sc.nextInt();
            if( value > max ) {
                max = value;
            }

            sum += value;
        }
        System.out.println(sum/max * 100.0 / subjectNum );

    }
}