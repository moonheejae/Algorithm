import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<String> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String[] input = scanner.nextLine().split(" ");
            map.put(input[0], input[1]);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("enter")) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result, Collections.reverseOrder());

        for (String user : result) {
            System.out.println(user);
        }
    }
}
