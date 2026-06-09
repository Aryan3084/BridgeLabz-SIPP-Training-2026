import java.util.Scanner;

public class HandshakeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(handshakes);
    }
}