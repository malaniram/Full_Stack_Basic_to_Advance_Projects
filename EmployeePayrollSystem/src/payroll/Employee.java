package payroll;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
	
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public abstract double calculateSalary();
	
	@Override
	
	public String toString() {
		return "Employee [name = " + name + ", id = " + id + ", salary = " + calculateSalary() +"]";
	}
}
