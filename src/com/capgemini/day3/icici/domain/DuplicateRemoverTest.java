package com.capgemini.day3.icici.domain;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day3.icici.DuplicateRemover;


class DuplicateRemoverTest {

	@Test
	void testDuplicateRemover() {
		assertEquals("abc",DuplicateRemover.modify("abcabcabcabcaba"));
		assertEquals("123",DuplicateRemover.modify("123123123123"));
		assertEquals("xyz",DuplicateRemover.modify("xyzxyzxyzyxyzx"));
		assertEquals("This anceprogm",DuplicateRemover.modify("This is a nice program"));
	}

}



