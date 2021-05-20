package singleinheritanceexample;

public class AccountsDEpartment extends HRDepartment {
      int noOfSalaryDays;
      public void calculateSalary() {
    	  noOfSalaryDays=noOfSalaryDays-showLeaveDays();
      }
}
