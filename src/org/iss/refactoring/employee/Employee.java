package org.iss.refactoring.employee;

public abstract class Employee {
	private String name;
	private float salary;
	
	public Employee (String name, float salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getBaseSalary() {
		return salary;
	}
	
	public void setBaseSalary(float salary) {
		this.salary = salary;
	}
	
	public float computeDeductions() {
		return salary*0.2f;
	}
	
	public float computeSalary() {
		return (getBaseSalary() - computeDeductions() + variableComponent());
	}
	
	public abstract float variableComponent();
}

