import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner( System.in );

        String[] input = scanner.nextLine().split(" ");

        int num = Integer.parseInt(input[0]);
        int index = Integer.parseInt(input[1]);


        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= num; i++ ){
            if(num % i == 0){
                list.add(i);
            }
        }
        if ( list.size() < index ){

            System.out.println(0);
        }
        else {
            System.out.println(list.get(index-1));
        }
        
    }
}