
public class Cat extends Animal{
	public Cat() {
		super();
	}
	
	public Cat(String name, int age, String color) {
		super(name,age,color);
		System.out.println("In cat constructor");
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Cat %s is %d years old and is of %s color ",name,age,color);
	}
	
	@Override
	public void greetings() {
		System.out.println("Meow");
	}
}
