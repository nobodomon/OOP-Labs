
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Milo",2,"Brown");
		Cat cat = new Cat("whiskey",3,"Brown");
		Duck duck = new Duck("Do",1,"White");
		Pig pig = new Pig("Po", 10, "Pink");
		dog.printInfo();
		dog.greetings();
		cat.printInfo();
		cat.greetings();
		duck.printInfo();
		duck.greetings();
		pig.printInfo();
		pig.greetings();
	}
}
