import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0; // No operations needed if x is already y

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, 0}); // Start from x with 0 operations
        boolean[] visited = new boolean[1000001]; // Assuming y is within a reasonable range
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int steps = current[1];

            // Try all possible operations
            int[] nextValues = new int[]{value * 3, value * 2, value + n};

            for (int next : nextValues) {
                if (next == y) {
                    return steps + 1; // Found y, return the number of steps
                }
                if (next < y && !visited[next]) {
                    queue.add(new int[]{next, steps + 1});
                    visited[next] = true;
                }
            }
        }

        return -1; // If y cannot be reached
    }
}
