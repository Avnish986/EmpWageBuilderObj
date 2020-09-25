package com.company_fetch;

public class EmpWageBuilderObj {
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int empRatePerHr=20;
	public static final int numOfDays=20;
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
	public int totalWage()
	{
		int empHrs=0, empWage=0, totalEmpWage=0;;
		for(int day=0;day<numOfDays;day++)
		{
		int fullPartStatus=(int) empFullPartStatus();
		switch(fullPartStatus) {
		case isPartTime:
		empHrs=4;
		break;

		case isFullTime:
		empHrs=8;
		break;

		default:
		empHrs=0;
		}
		empWage=empHrs*empRatePerHr;
		totalEmpWage+=empWage;
		System.out.println("Emp Wage : "+empWage);
		}
		return totalEmpWage;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilderObj empobj = new EmpWageBuilderObj();
		//String status = empobj.attendance();
		//System.out.println(status);
		int totalWage = empobj.totalWage();
		System.out.println("Emp Total Wage : "+totalWage);
	}

}
