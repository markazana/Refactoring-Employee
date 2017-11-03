package org.iss.refactoring.employee;

public class Manager extends Employee {
	private float variableComponent;
	
	
	public float getVariableComponent() {
		return variableComponent;
	}

	public void setVariableComponent(float variableComponent) {
		this.variableComponent = variableComponent;
	}

	public Manager (String name, float salary, float variableComponent){
		super (name, salary);
		this.variableComponent = variableComponent;
	}
	
	public float variableComponent() {
		return variableComponent;
	}
}

