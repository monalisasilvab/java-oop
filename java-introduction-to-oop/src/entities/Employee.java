package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double salaryReduction() {
		return grossSalary - tax;
	}
	
	public void salaryIncrease(double percent) {
		grossSalary += grossSalary * percent / 100.0;
	}
	
	public String toString() {
        return name + ", $ " + String.format("%.2f", salaryReduction());
    }
	
}
