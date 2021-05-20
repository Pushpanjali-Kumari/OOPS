package singleinheritanceexample;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Employee {

	
		private int empId;
		private String empName;
		private String empDob;
		private String empDoj;
		private float empSalary;
		Scanner sc=new Scanner(System.in);
		//creating the date objects
		Date dob=new Date();
		Date doj=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		public void addEmployee() throws ParseException {
			System.out.println("Enter the emlpoyee details:");
			System.out.println("Enter Employee Id=");
			empId=sc.nextInt();
			System.out.println("Enter Employee name=");
			sc.nextLine();
			empName=sc.nextLine();
			System.out.println("Enter Employee DOB(dd/MM/yyyy=");
			empDob=sc.next();
			dob=convertStringToDate(empDob);
			System.out.println("Enter Employee DOj(dd/MM/yyyy06=");
			empDoj=sc.next();
			doj=convertStringToDate(empDoj);
			System.out.println("Enter Employee salary=");
			empSalary=sc.nextFloat();
		}
        public Date convertStringToDate(String Date)throws ParseException {
        	Date stringToDate=sdf.parse(Date);
        	return stringToDate;
	}
        public void displayEmployeeDetails() {
        	System.out.println("employee deatils are:");
        	System.out.println("employee Id="+empId);
        	System.out.println("employee name="+empName);
        	System.out.println("employee Dob="+empDob);
        	System.out.println("employee Doj="+empDoj);
        	System.out.println("employee salary="+empSalary);
        }

}
