

abstract class Employee{
	private int eid;
	private int age;
	private String name;
	private double baseSalary;
	
	public Employee(String name, int age, int eid) {
		this.name = name;
		this.age = age;
		this.eid = eid;
	}
	
	public abstract double calculateSalary();
	
	public void printInfo() {
		
	}
	
	public void orientation() {
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}


class Main {
  public static void main(String[] args) {
	    Employee empRef;
	    empRef = new Manager("Jasmine",45,123,5);
	    empRef.setBaseSalary(5000);
	    empRef.printInfo();
	    empRef.orientation();
	    
	    empRef = new Developer("Aldo", 30, 345, 5, 2);
	    empRef.setBaseSalary(3500);
	    empRef.printInfo();
	    empRef.orientation();
	    
	    empRef = new Designer("Chris", 25, 780, 4);
	    empRef.setBaseSalary(2500);
	    empRef.printInfo();
	    empRef.orientation();
  }
}