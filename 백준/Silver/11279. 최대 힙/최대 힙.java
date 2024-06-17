import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (!maxHeap.isEmpty()) {
                    System.out.println(maxHeap.poll());
                } else {
                    System.out.println(0); // 힙이 비어있을 때 0을 출력합니다.
                }
            } else {
                maxHeap.offer(input);
            }
        }
    }
}
