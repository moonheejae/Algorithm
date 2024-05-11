import java.util.*;


public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        int number = 1;
        for ( int i = 0; i < in; i++ ){

            qu.add(number++);
        }

        int cnt = 1;

        while( !qu.isEmpty() ){

            if( qu.size() == 1 ){
                System.out.println(qu.poll());
                return;
            }
            if( cnt % 2 == 0 ){
                int temp = qu.peek();
                qu.poll();
                qu.add(temp);


            }else if( cnt % 2 == 1 ) {
                qu.poll();
            }
            cnt++;
        }
    }
}
