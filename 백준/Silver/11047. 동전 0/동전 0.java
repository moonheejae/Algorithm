 import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();
        Integer[] coins = new Integer[n];
        for ( int i = 0; i < n; i++ ){
             coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());

        int need = 0;
        for( int i : coins ){
            need += k / i;
            k %= i;
            if( k == 0 ) break;
        }
        
        System.out.println(need);
    }
}