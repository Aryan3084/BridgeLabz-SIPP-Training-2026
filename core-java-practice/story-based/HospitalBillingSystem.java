import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void processPayment(double billAmount, double paidAmount) throws InsufficientFundsException {
        if (paidAmount < billAmount) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter total bill amount: ");
            double totalBill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double averageCost = totalBill / items;
            System.out.println("Average cost per item: " + averageCost);

            String[] patients = {"Aryan", "Rahul", "Priya", "Aman"};

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient: " + patients[index]);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            processPayment(totalBill, payment);

        } catch (ArithmeticException e) {
            System.out.println("Billing error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Input error: Please enter valid numeric values.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}