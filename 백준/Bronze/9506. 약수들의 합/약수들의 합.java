
import java.util.*;


public class Main {

    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);
        int k = 0;

        while (k != -1) {
            k = sc.nextInt();
            if (k == -1) {
                break;
            }

            if (k <= 0) {
                continue;
            }
            List<Integer> divisors = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= k / 2; i++) {
                if (k % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }
            if (sum == k) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < divisors.size(); i++) {
                    result.append(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        result.append(" + ");
                    }
                }
                System.out.println(k + " = " + result.toString());
            } else {
                System.out.println(k + " is NOT perfect.");
            }

        }
    }
}

