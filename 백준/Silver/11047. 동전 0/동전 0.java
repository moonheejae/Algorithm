import java.util.*;


public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for ( int i = 0; i < n; i++ ){

             coins[i] = sc.nextInt();
        }

        Arrays.sort(coins);

        int now;
        int need = 0;
        for( int i = coins.length-1; i > -1; i-- ){
            now = k / coins[i];
            if(now >= 1){
                need += now;
                k %= coins[i];
            }
            if( k == 0 ){
                break;
            }
        }
        System.out.println(need);

    }
}