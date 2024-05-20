import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0; i < N; i++){
            list[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Compute the sum of the first K elements
        for(int i = 0; i < K; i++){
            currentSum += list[i];
        }

        maxSum = currentSum;

        // Use sliding window technique to find the maximum sum of K consecutive elements
        for(int i = K; i < N; i++){
            currentSum = currentSum - list[i - K] + list[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);
    }
}
