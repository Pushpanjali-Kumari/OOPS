package singleinheritanceexample;

import java.text.ParseException;

public class MainInheritance {

	public static void main(String[] args) throws ParseException {
		/*
		 * // TODO Auto-generated method stub Employee emp=new Employee();
		 * emp.addEmployee(); emp.displayEmployeeDetails();
		 */
HRDepartment hrd=new HRDepartment();
hrd.addEmployee();
hrd.displayEmployeeDetails();
hrd.readLeaveDays();
hrd.showLeaveDays();

	}

	
}
