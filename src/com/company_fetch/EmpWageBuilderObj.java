package com.company_fetch;

public class EmpWageBuilderObj {
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHr=20;
	public String attendance()
	{
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isFullTime)
			return "Employee Present";
		else
			return "Employee Absent";
	}
	public double empFullPartStatus()
	{
		double empCheck=Math.floor(Math.random()*10)%3;
		return empCheck;
	}
	public int dailyWage()
	{
		int empHrs=0, empWage=0;
		int fullPartStatus=(int) empFullPartStatus();
		if(fullPartStatus==isPartTime)
			empHrs=4;
			else if(fullPartStatus==isFullTime)
			empHrs=8;
			else
			empHrs=0;
			empWage=empHrs * empRatePerHr;
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
