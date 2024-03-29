
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner( System.in );


        int num = Integer.parseInt(scanner.nextLine());

        String[] cards = new String[num];

        for ( int i = 0; i < num; i++ ) {
            cards[i] = scanner.nextLine();
        }

        for ( int k = 0; k < num; k++ ) {

            int result = 0;

            for ( int j = 0; j < cards[k].length(); j++ ){

                char ch = cards[k].charAt(j);

                if( ch == '(' ) {
                    result += 1;
                } else if ( ch == ')' ) {
                    result -= 1;
                }

                if( result == -1 ) {
                    break;
                }
            }
            if( result == 0 ) {

                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
    }
}
