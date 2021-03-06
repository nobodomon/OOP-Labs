import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double inputInUSD = 0;
		do {
			System.out.println("Enter the amount in USD");
			try {
				inputInUSD = input.nextDouble();
				if(inputInUSD < 0)
					break;
				double inputInSGD = inputInUSD * 1.35;
				System.out.println("The final amount in SGD " + inputInSGD);
			}catch(InputMismatchException e) {
				System.out.println("Error!");
				break;
			}
		}while(inputInUSD >= 0);
		input.close();
	}
	
}