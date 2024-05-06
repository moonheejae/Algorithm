import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine().trim());

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            int value = 0;
            String line = br.readLine().trim();

            if (line.startsWith("1")) {
                String[] tokens = line.split("\\s");
                st.push(Integer.parseInt(tokens[1]));
            } else {
                value = Integer.parseInt(line);
            }
            switch (value) {
                case 2:
                    if (!st.isEmpty()) {
                        sb.append(st.pop()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                case 3:
                    sb.append(st.size()).append('\n');
                    break;
                case 4:
                    sb.append(st.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 5:
                    if (!st.isEmpty()) {
                        sb.append(st.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.print(sb);
    }
}
