package com.capgemini.day3.icici.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


		import org.junit.jupiter.api.AfterEach;
		import org.junit.jupiter.api.BeforeEach;
		import org.junit.jupiter.api.Test;

		public class EmployeeTest {
			
			Employee employee;
			
			@BeforeEach
			void setUp() {
				employee = new Employee(1234,"John Doe",13000, 2500);
			}
			
			@Test
			void testCalculateNetSalary() {
				assertEquals(20240.0, employee.calculateNetSalary(), 0.03);
			}
			
			@AfterEach
			void tearDown() {
				employee = null;	
	}

}
