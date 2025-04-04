import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] arg){

        // Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter interest rate {in %}: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The total amount after %d is: %.2f$", years,amount);

        scanner.close();
    }
}



