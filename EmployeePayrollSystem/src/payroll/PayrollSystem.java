package payroll;

import java.util.ArrayList;

class PayrollSystem {
	private ArrayList<Employee> employeeList;
	
	public PayrollSystem() {
		employeeList = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for(Employee employee : employeeList) {
			if(employee.getId() == id) {
				employeeToRemove = employee;
				break;
			}
		}
			
		if(employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
		}
	}
	
	public void displayEmployees() {
		for(Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
	
}
