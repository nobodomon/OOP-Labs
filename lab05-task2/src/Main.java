import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			CircleWithException circle1 = new CircleWithException(5);
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("this is from finally");
		}
    try {
			CircleWithException circle2 = new CircleWithException(1000);
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("this is from finally");
		}
    try {
			CircleWithException circle3 = new CircleWithException(-5);
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("this is from finally");
		}
	}
}
