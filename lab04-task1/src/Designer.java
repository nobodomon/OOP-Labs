
public class Designer extends Employee{
	private int noOfDesigns;
	Designer(String name, int age, int eid, int noOfDesigns){
		super(name,age,eid);
		this.noOfDesigns = noOfDesigns;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getBaseSalary() + (0.5 * noOfDesigns);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Name of the employee:%s is %d years old. ",this.getName(),this.getAge());
	}
	
	@Override
	public void orientation() {
		System.out.printf("His employee id is: %d. No of designs done: %d. Salary: %.2f\n",this.getEid(),this.noOfDesigns,this.calculateSalary());
	}
}
