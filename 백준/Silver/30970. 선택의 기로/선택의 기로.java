import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[][] products = readProducts(scanner, number);

        printBestQualityLowestPrice(products);
        printLowestPriceBestQuality(products);
    }

    private static int[][] readProducts(Scanner scanner, int number) {
        int[][] products = new int[number][2];
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");
            products[i][0] = Integer.parseInt(input[0]);
            products[i][1] = Integer.parseInt(input[1]);
        }
        return products;
    }

    private static void printBestQualityLowestPrice(int[][] products) {
        Arrays.sort(products, Comparator.comparingInt((int[] product) -> product[0]).reversed()
                .thenComparingInt((int[] product) -> product[1]));

        printTopTwo(products);
    }

    private static void printLowestPriceBestQuality(int[][] products) {
        Arrays.sort(products, Comparator.comparingInt((int[] product) -> product[1]));

        printTopTwo(products);
    }

    private static void printTopTwo(int[][] products) {
        for (int i = 0; i < 2; i++) {
            System.out.print(products[i][0] + " " + products[i][1] + " ");
        }
        System.out.println();
    }
}
