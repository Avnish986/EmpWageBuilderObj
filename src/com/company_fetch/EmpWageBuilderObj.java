package com.company_fetch;

public class EmpWageBuilderObj {
	public static final int isFullTime=1;
	public static final int empRatePerHr=20;
	public String attendance()
	{
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isFullTime)
			return "Employee Present";
		else
			return "Employee Absent";
	}
	public double empFullStatus()
	{
		double empCheck=Math.floor(Math.random()*10)%2;
		return empCheck;
	}
	public int dailyWage()
	{
		int empHrs=0, empWage=0;
		int fullStatus=(int) empFullStatus();
		if(fullStatus==isFullTime)
			empHrs=8;
			else
			empHrs=0;
			empWage= empHrs * empRatePerHr;
			return empWage;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilderObj empobj = new EmpWageBuilderObj();
		String status = empobj.attendance();
		System.out.println(status);
		int wage = empobj.dailyWage();
		System.out.println("Emp Wage : "+wage);
	}

}
