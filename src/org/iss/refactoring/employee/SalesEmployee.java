package org.iss.refactoring.employee;

public class SalesEmployee extends Employee {
	private float commissionRate;
	private int salesMade;
	
	public float getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}

	public int getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	}

	public SalesEmployee (String name, float salary, float commissionRate, int salesMade){
		super(name, salary);
		this.commissionRate = commissionRate;
		this.salesMade = salesMade;
	}
	
	public float variableComponent() {
		return salesMade*commissionRate;
	}
}
