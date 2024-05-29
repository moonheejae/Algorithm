 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        int bak = 0;
        for( int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
                switch ( str[0] ){
                    case "1" :
                        deque.addFirst(Integer.parseInt(str[1]));
                        break;
                    case "2" :
                        deque.addLast(Integer.parseInt(str[1]));
                        break;
                    case "3" :
                        sb.append(deque.isEmpty()? -1 : deque.removeFirst()).append("\n");
                        break;
                    case "4" :
                        sb.append(deque.isEmpty()? -1 : deque.removeLast()).append("\n");
                        break;
                    case "5":
                        sb.append(deque.size()).append("\n");
                        break;
                    case "6" :
                        sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case "7":
                        sb.append(deque.isEmpty() ? -1 : deque.peek()).append("\n");
                        break;
                    case "8":
                        sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                        break;
                }


        }
        System.out.println(sb.toString());
    }
}
