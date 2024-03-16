import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        //정수 갯수
        int number = Integer.parseInt(sc.nextLine());


        //정수 리스트
        String list = sc.nextLine();
        String[] numberList = list.split(" ");

        //입력 정수
        int search = sc.nextInt();
        int result = 0;

        for (String str : numberList) {
            if (Integer.parseInt(str) == search) {
                result++;
            }
        }

        System.out.println(result);


    }
}