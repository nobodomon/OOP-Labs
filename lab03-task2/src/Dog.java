
public class Dog extends Animal{
	public Dog() {
		super();
	}
	
	public Dog(String name, int age, String color) {
		super(name,age,color);
		System.out.println("In dog constructor");
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Dog %s is %d years old and is of %s color ",name,age,color);
	}
	
	@Override
	public void greetings() {
		System.out.println("Woof woof");
	}
}
