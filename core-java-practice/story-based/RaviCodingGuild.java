public class RaviCodingGuild {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 22;
        String rank = "Member";
        double salary = 50000;
        float membershipFee = 250.5f;

        int bonus = (int)(salary * 12 / 100);

        System.out.println("Welcome Card");
        System.out.println("------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Rank : " + rank);
        System.out.println("Salary : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus : " + bonus);
    }
}