import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int num = Integer.parseInt(reader.readLine());
        int[] arr = new int[num];
        int[] result = new int[num];
        Stack<Integer> stack = new Stack<>();

        String[] input = reader.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(input[i]);
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < num; i++) {
            output.append((result[i] == 0 ? -1 : result[i])).append(" ");
        }

        System.out.println(output.toString().trim());
    }
}
