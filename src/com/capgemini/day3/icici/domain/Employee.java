package com.capgemini.day3.icici.domain;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double grossSalary;
	private double netSalary;
	private double medical;
	private double hra;
	private double pf;
	
	public static final double PT = 200;
	
	public Employee() {	
		}
	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;}		

	public double calculateNetSalary()
	{
		hra = 0.5 * basicSalary;
		pf = 0.12 * basicSalary;
		grossSalary = hra + basicSalary + medical;
		netSalary = grossSalary - (pf + PT);
		return netSalary;
	}
	public void displayEmployeeInfo() {
		System.out.println("Employee Id: " + employeeId + "\nEmployee name: " + employeeName
				+ "\nEmployee Net salary: " + netSalary);
		
	}}
	