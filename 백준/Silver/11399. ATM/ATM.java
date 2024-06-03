import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사람 수 입력
        int N = Integer.parseInt(sc.nextLine());

        // 인출 시간 입력
        String[] str = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(str[i]));
        }

        // 인출 시간을 정렬
        list.sort(Comparator.naturalOrder());

        // 최소 시간 합 계산
        int wait = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            wait += list.get(i);
            total += wait;
        }

        // 결과 출력
        System.out.println(total);

        // Scanner 객체 닫기
        sc.close();
    }
}
