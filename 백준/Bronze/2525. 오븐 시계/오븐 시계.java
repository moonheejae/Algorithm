
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        String input = sc.nextLine();
        String[] time = input.split(" ");
        int H = Integer.parseInt(time[0]);
        int M = Integer.parseInt(time[1]);

        int missionMin = sc.nextInt();

        M += missionMin;
        H += M / 60; 
        M %= 60; 
   
        H %= 24;

        System.out.println(H + " " + M);


    }
}