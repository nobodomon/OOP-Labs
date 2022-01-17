import java.util.Date;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate/100;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = new Date(System.currentTimeMillis());
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	
	public double calculateMonthlyPayment() {
		double monthlyInterestRate = this.annualInterestRate / 12;
		double monthlyPayment = (this.loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate,this.numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double calculateTotalPayment() {
		double totalPayment = this.calculateMonthlyPayment() * this.numberOfYears * 12;
		return totalPayment;
	}
}
