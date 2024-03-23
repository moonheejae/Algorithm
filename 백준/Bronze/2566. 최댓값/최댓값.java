
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] list =  new int[9][9];
        int max = -1;
        int col = 0;
        int row = 0;
        for ( int i = 0; i < 9; i++ ) {
            String[] cols = br.readLine().split(" ");
            for ( int j = 0; j < 9; j++ ){
                list[i][j] = Integer.parseInt( cols[j] );
                if ( list[i][j] > max ) {
                    max = list[i][j];
                    col = j + 1;
                    row = i + 1;
                }
            }
        }

        System.out.println( max );
        System.out.println( row + " " + col );
        
    }
}