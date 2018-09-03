package com.capgemini.day3.icici.domain;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevisionTest
{
 Television television;
 
 @BeforeEach
 void setUp() 
 {
	  television= new Television(0,1,false);
 }
	void TelevisionStateTest() 
	{
	 assertEquals(false,television.stateTest());
	}
	@Test
	void TelevisionVolumeTest() 
	{
		assertEquals(1,television.increaseVolume());
		assertEquals(0,television.decreaseVolume());
	}
	
	@Test
	void TelevisionChangeChannelTest() 
	{
		assertEquals(3,television.changeChannel(3));
	}
	@Test
	void testpower()
	{
		assertEquals("on", Television.checkPower(true));
	}
	@Test
	void testCurrentvolume()
	{
		assertEquals(0,television.currentVolume());
	}
	@AfterEach
	void tearDown() {
		television = null;
	}
}

