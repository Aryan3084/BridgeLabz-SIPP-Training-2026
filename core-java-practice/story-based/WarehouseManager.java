import java.util.*;

public class WarehouseManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stock = new int[n];

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        HashSet<Integer> set = new HashSet<>();
        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            if (stock[i] > max) {
                max = stock[i];
            }

            if (stock[i] < min) {
                min = stock[i];
            }

            total += stock[i];

            if (set.contains(stock[i])) {
                duplicate = true;
            } else {
                set.add(stock[i]);
            }
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);
        System.out.println("Duplicates Present: " + duplicate);

        int k = sc.nextInt();
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("Rotated Stock Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }

        System.out.println();

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] shelf = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transposed Shelf Grid:");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }
    }
}