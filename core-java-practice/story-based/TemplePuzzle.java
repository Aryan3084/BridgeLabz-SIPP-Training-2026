import java.util.Scanner;

class TemplePuzzle {
    int moveCount = 0;

    void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    int binarySearch(int[] prices, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (prices[mid] == target) {
            return mid;
        }

        if (target < prices[mid]) {
            return binarySearch(prices, left, mid - 1, target);
        }

        return binarySearch(prices, mid + 1, right, target);
    }

    int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }

        return number % 10 + sumOfDigits(number / 10);
    }

    String reverseString(String text) {
        if (text.length() <= 1) {
            return text;
        }

        return reverseString(text.substring(1)) + text.charAt(0);
    }

    boolean isBalanced(String text, int index, int count) {
        if (count < 0) {
            return false;
        }

        if (index == text.length()) {
            return count == 0;
        }

        if (text.charAt(index) == '(') {
            return isBalanced(text, index + 1, count + 1);
        }

        if (text.charAt(index) == ')') {
            return isBalanced(text, index + 1, count - 1);
        }

        return isBalanced(text, index + 1, count);
    }
}

public class TempleHanoiRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TemplePuzzle puzzle = new TemplePuzzle();

        int disks = sc.nextInt();

        puzzle.towerOfHanoi(disks, 'A', 'B', 'C');
        System.out.println("Total Moves: " + puzzle.moveCount);

        int size = sc.nextInt();
        int[] prices = new int[size];

        for (int i = 0; i < size; i++) {
            prices[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println("Binary Search Index: " +
                puzzle.binarySearch(prices, 0, size - 1, target));

        int number = sc.nextInt();
        System.out.println("Sum Of Digits: " + puzzle.sumOfDigits(number));

        sc.nextLine();
        String text = sc.nextLine();
        System.out.println("Reversed String: " + puzzle.reverseString(text));

        String parentheses = sc.nextLine();
        System.out.println("Balanced Parentheses: " +
                puzzle.isBalanced(parentheses, 0, 0));
    }
}