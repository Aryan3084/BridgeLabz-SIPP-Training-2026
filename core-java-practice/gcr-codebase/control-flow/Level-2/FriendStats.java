import java.util.*;

class FriendStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        String youngest = amarAge <= akbarAge && amarAge <= anthonyAge ? "Amar"
                : akbarAge <= anthonyAge ? "Akbar" : "Anthony";

        String tallest = amarHeight >= akbarHeight && amarHeight >= anthonyHeight ? "Amar"
                : akbarHeight >= anthonyHeight ? "Akbar" : "Anthony";

        System.out.println(youngest);
        System.out.println(tallest);
    }
}