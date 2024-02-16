package payroll;

class FullTimeEmployee extends Employee {
	private double monthlySalary;
	
	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}