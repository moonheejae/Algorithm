import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner( System.in );


        String[] lineList = scanner.nextLine().split(" ");
        int card = Integer.parseInt(lineList[0]);
        int blackjack = Integer.parseInt(lineList[1]);

        String[] cardList = scanner.nextLine().split(" ");
        Integer[] cards = new Integer[card];

        for ( int i = 0; i < card; i++ ) {
            cards[i] = Integer.valueOf(cardList[i]);
        }

        int sum = 0;

        int temp = 0;

        for ( int j = 0; j < card; j++ ){

            for ( int k = 0; k < j; k++ ){

                for( int p = 0; p < k; p++ ) {

                    temp = cards[j] + cards[k] + cards[p];

                    if( temp == blackjack ){
                        sum = temp;
                        break;
                    }
                    if( sum < temp && temp <= blackjack) {

                        sum = temp;
                    }
                }
            }
        }

        System.out.println(sum);

    }



}
