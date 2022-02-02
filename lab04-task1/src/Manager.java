
public class Manager extends Employee{
	private int handlingEmployees;
	Manager(String name, int age, int eid, int handlingEmployees){
		super(name,age,eid);
		this.handlingEmployees = handlingEmployees;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getBaseSalary() + (0.75 * handlingEmployees);
	}
	
	@Override
	public void printInfo() {
		System.out.printf("Name of the employee:%s is %d years old.",this.getName(),this.getAge());
	}
	
	@Override
	public void orientation() {
		System.out.printf(" His employee id is: %d. Handling: %d. Salary: %.2f\n",this.getEid(),this.handlingEmployees,this.calculateSalary());
	}
}
