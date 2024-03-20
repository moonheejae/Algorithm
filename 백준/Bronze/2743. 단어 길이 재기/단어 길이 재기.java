import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        String inputStr = sc.next();

        char[] array = inputStr.toCharArray();

        System.out.println(array.length);
    }
}