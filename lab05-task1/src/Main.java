import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		do {
		System.out.println("Input one String: ");
		input = sc.nextLine();
		MyString ms = new MyString();
		System.out.println("backward is: " + ms.backwardsString(input) + '\n');
		}while(!input.isEmpty());
	}
}
