
public class Developer extends Employee{
	private int testingCodes;
	private int developingCodes;
	Developer(String name, int age, int eid, int testingCodes, int developingCodes){
		super(name,age,eid);
		this.testingCodes = testingCodes;
		this.developingCodes = developingCodes;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getBaseSalary() + (0.25 * testingCodes) + (0.5 * developingCodes);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Name of the employee:%s is %d years old. ",this.getName(),this.getAge());
	}
	
	@Override
	public void orientation() {
		System.out.printf("His employee id is: %d. Testing Codes: %d Developing codes: %d. Salary: %.2f\n",this.getEid(),this.testingCodes,this.developingCodes,this.calculateSalary());
	}
}
