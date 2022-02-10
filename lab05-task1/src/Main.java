import java.util.Scanner;
interface PlayString {
	
	StringBuilder backwardsString(String s); 

}

class Main {
  public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("Input a string");
		input = sc.nextLine();
		MyString ms = new MyString();
		System.out.println("Inputted String: " + input);
		System.out.println("backward is: " + ms.backwardsString(input));
  }
}