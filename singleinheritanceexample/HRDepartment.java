package singleinheritanceexample;

public class HRDepartment extends Employee {
	private int noOfWorkingDays=30;
	private int leaveDays;
	
	public void readLeaveDays() {
		System.out.println("enter no of days leave");
		leaveDays=sc.nextInt();
	}
	//this method is used to calculate salary
	public int showLeaveDays() {
		System.out.println("no of leave days="+leaveDays);
		return leaveDays;
	}
public int showNoOfWorkingDays() {
	return noOfWorkingDays;
}
}
