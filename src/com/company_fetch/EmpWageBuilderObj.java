package com.company_fetch;

public class EmpWageBuilderObj {
	public static final int isFullTime=1;
	public String attendance()
	{
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isFullTime)
			return "Employee Present";
		else
			return "Employee Absent";
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilderObj empobj = new EmpWageBuilderObj();
		String status = empobj.attendance();
		System.out.println(status);
	}

}
