import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		double annualInterestRate;
		int numberOfYears;
		double loanAmount;
		
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter annual interest rate, for example, 8.25:");
			annualInterestRate = input.nextDouble();
			System.out.println("Enter the amount of years as an integer:");
			numberOfYears = input.nextInt();
			System.out.println("Enter loan amount, for example, 120000. 95:");
			loanAmount = input.nextDouble();
			Loan newloan = new Loan(annualInterestRate, numberOfYears, loanAmount);
			System.out.println("The loan was created.");
			System.out.printf("The monthly payment is %.2f\n",newloan.calculateMonthlyPayment());
			System.out.printf("The total payment is %.2f",newloan.calculateTotalPayment());
		}catch(InputMismatchException e) {
			System.out.println("Error!");
		}
		input.close();
	}
}
