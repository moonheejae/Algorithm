
import java.util.*;


public class Main {
    static int N;
    static int[]arr;
    static int count = 0;
    
    public static void queen (int depth){
        if(depth == N ){
            count++;
            return;
        }
        for ( int i = 0; i < N; i++ ){
            arr[depth] = i;
            if( valid(depth)){
                queen(depth+1);
            }
        }
    }
    public static boolean valid ( int col ){
        for ( int i = 0; i < col; i++ ){
            if ( arr[col] == arr[i] ){
                return false;
            }
            else if( Math.abs(col-i) == Math.abs(arr[col] - arr[i])){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];

        queen(0);

        System.out.println(count);
    }
}