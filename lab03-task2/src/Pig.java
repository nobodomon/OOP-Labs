
public class Pig extends Animal{


	public Pig() {
		super();
	}
	
	public Pig(String name, int age, String color) {
		super(name,age,color);
		System.out.println("In pig constructor");
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Pig %s is %d years old and is of %s color ",name,age,color);
	}
	
	@Override
	public void greetings() {
		System.out.println("Oink");
	}
}
