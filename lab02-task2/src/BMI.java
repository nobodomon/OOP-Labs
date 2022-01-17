
public class BMI {
	double weight;
	double height;
	
	public double calculateBMI() {
		return this.weight / Math.pow(this.height,2) * 703;
	}

	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public String getBMIRange() {
		double bmi = calculateBMI();
		if(bmi < 18.5) {
			return "Underweight";
		}else if(bmi >= 1.85 && bmi < 25.0) {
			return "Normal";
		}else if(bmi >= 25.0 && bmi < 30.0) {
			return "Overweight";
		}else if(bmi >= 30.0) {
			return "Obese";
		}else {
			return "error!";
		}
	}
	
}
