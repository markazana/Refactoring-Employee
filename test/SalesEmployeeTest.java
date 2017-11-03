import static org.junit.Assert.*;

import org.iss.refactoring.employee.SalesEmployee;

import junit.framework.TestCase;

import org.junit.Test;


public class SalesEmployeeTest  extends TestCase{

	@Test
	public void testComputeSalary() {
		SalesEmployee salesEmployee = new SalesEmployee("Jack", 2000.0f, 300.0f, 20);
		assertTrue( salesEmployee.computeSalary() == 7600.0);
	}

}
