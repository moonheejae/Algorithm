import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            stringBuilder.append(line).append("\n");
        }

        String data = stringBuilder.toString();
        System.out.println(data);
        scanner.close();
    }
}