
public class Duck extends Animal{

	public Duck() {
		super();
	}
	
	public Duck(String name, int age, String color) {
		super(name,age,color);
		System.out.println("In duck constructor");
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Duck %s is %d years old and is of %s color ",name,age,color);
	}
	
	@Override
	public void greetings() {
		System.out.println("Quack");
	}
}
