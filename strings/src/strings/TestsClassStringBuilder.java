
package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsClassStringBuilder {

	final StringBuilder strBilderTest = new StringBuilder("Hello");
	@Test
	void testAppendString() {
		String strForAppend = " World";
		String exp = "Hello World";
		assertEquals(exp, strBilderTest.append(strForAppend).toString());	}

	@Test
	void testReplaceIntIntString() {
		assertEquals("Hello", strBilderTest.replace(1, 4, "ell").toString());
	}

	@Test
	void testInsertIntString() {
		strBilderTest.insert(2, "lLO");
		assertEquals("HelLoll0", strBilderTest.toString());	}

	@Test
	void testReverse() {
		//[YG] this test should not pass
		StringBuilder anagram = new StringBuilder("Do Geese see GoD");
		String exp = "Do Geese see God";
		assertEquals(exp, anagram.reverse().toString());
	}

}
