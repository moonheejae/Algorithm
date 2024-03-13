
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        String input = sc.nextLine();
        String[] time = input.split(" ");
        int H = Integer.parseInt(time[0]);
        int M = Integer.parseInt(time[1]);

        int missionMin = 45;


        if (M - missionMin < 0){
            H -= 1;
            if ( H < 0 ) {
                H = 24 - 1;
            }
            M = 60 + M - missionMin;
        } else {
            M -= 45;
        }


        System.out.println(H + " " + M);


    }
}