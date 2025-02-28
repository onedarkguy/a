import java.util.*;
import java.lang.Math;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Number of times interest applied per time period: " + n);
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Amount: " + amount);

        scanner.close();
    }
}