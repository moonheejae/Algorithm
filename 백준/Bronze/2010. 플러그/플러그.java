import java.util.*;


public class Main {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int result = 0;
        
        for(int i = 0; i < N; i++ ){
            int temp = Integer.parseInt(sc.nextLine());
            result += (i == N-1)? temp : temp - 1;
        }
        
        System.out.println(result);
    }
}
