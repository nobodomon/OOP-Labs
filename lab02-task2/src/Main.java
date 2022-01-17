import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		double weight;
		double height;
		
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter weight in pounds: ");
			weight = input.nextDouble();
			System.out.println("Enter height in inches: ");
			height = input.nextDouble();
			BMI bmi = new BMI(weight, height);
			System.out.printf("The BMI is %.2f\n", bmi.calculateBMI());
			System.out.println(bmi.getBMIRange());
		}catch(InputMismatchException e) {
			System.out.println("Error!");
		}
		input.close();
	}
}
