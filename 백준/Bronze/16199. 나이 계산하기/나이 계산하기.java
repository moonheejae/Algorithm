import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();
        int birthMonth = scanner.nextInt();
        int birthDay = scanner.nextInt();
        int todayYear = scanner.nextInt();
        int todayMonth = scanner.nextInt();
        int todayDay = scanner.nextInt();

        int age;
        if (todayMonth > birthMonth || (todayMonth == birthMonth && todayDay >= birthDay)) {
            age = todayYear - birthYear;
        } else {
            age = todayYear - birthYear - 1;
        }

        System.out.println(age);
        System.out.println(todayYear - birthYear + 1);
        System.out.println(todayYear - birthYear);
    }
}
