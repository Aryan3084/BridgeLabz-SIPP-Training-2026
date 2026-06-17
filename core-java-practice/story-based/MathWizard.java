import java.util.Scanner;

class MathWizard {
    int instanceValue = 100;

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    void fibonacci(int n) {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void showScopeDifference() {
        int instanceValue = 50;

        System.out.println("Local Variable: " + instanceValue);
        System.out.println("Instance Variable: " + this.instanceValue);
    }
}

public class MathWizardUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MathWizard wizard = new MathWizard();

        int number = sc.nextInt();
        System.out.println("Prime: " + wizard.isPrime(number));

        int factorialNumber = sc.nextInt();
        System.out.println("Factorial (int): " + wizard.factorial(factorialNumber));

        double doubleNumber = sc.nextDouble();
        System.out.println("Factorial (double): " + wizard.factorial(doubleNumber));

        int fibonacciTerms = sc.nextInt();
        wizard.fibonacci(fibonacciTerms);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + wizard.gcd(a, b));
        System.out.println("LCM: " + wizard.lcm(a, b));

        int base = sc.nextInt();
        int exponent = sc.nextInt();

        System.out.println("Power: " + wizard.power(base, exponent));

        wizard.showScopeDifference();
    }
}