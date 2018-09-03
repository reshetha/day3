package com.capgemini.day3.icici.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day3.icici.Distinct;



class DistinctTest {

	@Test
	void testDistinct() {
		assertEquals(2,Distinct.find(new int [] {3,0,1},3));
		assertEquals(4,Distinct.find(new int [] {3,0,1,5,2,6},6));
		assertEquals(-1,Distinct.find(new int [] {3,0,1,5,2,4,6},7));
	}


}
