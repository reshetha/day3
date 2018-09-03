package com.capgemini.day3.icici.domain;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.icici.WordRev;



class WordRevTest {

	@Test
	void testWordRevTest() {
		assertEquals("olleH ssenkrad ym dlo ,dneirf I evah emoc ot klat ot uoy niaga ",WordRev.reverseString("Hello darkness my old friend, I have come to talk to you again"));
		assertEquals("mahbuhS avatsavirS ",WordRev.reverseString("Shubham Srivastava"));
	}



}
