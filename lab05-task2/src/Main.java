import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Create a circle for radius ");
		try {
			int radius = sc.nextInt();
			CircleWithException circle = new CircleWithException(radius);
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("this is from finally");
		}
	}
}
