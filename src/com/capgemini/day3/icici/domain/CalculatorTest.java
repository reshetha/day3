package com.capgemini.day3.icici.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

		@Test
		void testCalculator() {
			assertEquals(15, Calculator.sum(10,5));
			assertEquals(5, Calculator.difference(10,5));
			assertEquals(50, Calculator.product(10,5));
			assertEquals(2.0, Calculator.division(10,5));
		}

	}

