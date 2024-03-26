
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner( System.in );

        int totalCount = scanner.nextInt(); // 갯수
        int personCount = scanner.nextInt(); // 사람 수
        
        scanner.nextLine();
        
        String scoresInput = scanner.nextLine();
        String[] scoresStr = scoresInput.split(" ");
        int[] scores = new int[totalCount]; 
        for (int i = 0; i < totalCount; i++) {
            scores[i] = Integer.parseInt(scoresStr[i]);
        }

        Arrays.sort( scores );

        System.out.println( scores[totalCount - personCount] );


    }
}