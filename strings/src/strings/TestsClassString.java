package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestsClassString {
	final String strTest = "HelLo WorlD";
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCharAt() {
		assertEquals('H', strTest.charAt(0));
		assertEquals('L', strTest.charAt(3));
		}

	@Test
	void testEqualsIgnoreCase() {
		assertTrue(strTest.equalsIgnoreCase("Hello World"));
		assertFalse(strTest.equalsIgnoreCase("Helo worlD"));
	}

	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, strTest.compareToIgnoreCase("hello world"));
		assertEquals(-3, strTest.compareToIgnoreCase("hello worldsss"));
		assertEquals(2, strTest.compareToIgnoreCase("hello WOR"));
	}
	@Test
	void testStartsWithStringInt() {
		assertTrue(strTest.startsWith("o ", 4));
		assertFalse(strTest.startsWith(" W", 7));
		}

	@Test
	void testStartsWithString() {
		assertTrue(strTest.startsWith("Hel"));
		assertFalse(strTest.startsWith("hel"));	
		}

	@Test
	void testEndsWith() {
		assertFalse(strTest.endsWith("World"));
		assertTrue(strTest.endsWith("WorlD"));	
		}

	@Test
	void testIndexOfInt() {
		assertEquals(4,strTest.indexOf(111));
		assertEquals(-1,strTest.indexOf('F'));		
		}

	@Test
	void testIndexOfIntInt() {
		assertEquals(4, strTest.indexOf('o', 3 ));
		}

	@Test
	void testLastIndexOfIntInt() {
		assertEquals(7, strTest.lastIndexOf('o', strTest.length()-1 ));
		assertEquals(4,  strTest.lastIndexOf('o', 5));	
		}

	@Test
	void testIndexOfString() {
		assertEquals(5, strTest.indexOf(" "));
		assertEquals(8, strTest.indexOf("r"));	
		}

	@Test
	void testLastIndexOfString() {
		assertEquals(-1, strTest.indexOf('O'));
		assertEquals(4, strTest.indexOf('o') );
		}

	@Test
	void testSubstringInt() {
		assertEquals("WorlD", strTest.substring(6));
		}

	@Test
	void testSubstringIntInt() {
		assertEquals("Wo", strTest.substring(6, 8));
		}

	@Test
	void testContains() {
		assertFalse(strTest.contains("Hello"));
		assertTrue(strTest.contains(" Worl"));	}

	@Test
	void testJoinCharSequenceCharSequenceArray() {
		String[] arrStr = {"I","like","New","Year"};
		assertEquals("I_like_New_Year",strTest.join("_",arrStr));	}

	@Test
	void testToLowerCase() {
		assertEquals("hello world", strTest.toLowerCase());	}

	@Test
	void testTrim() {
		String str= "  HelLo WorlD  ";
		String strEnd = "HelLo WorlD  ";
		assertEquals("HelLo WorlD", str.trim());
		assertEquals("HelLo WorlD", strEnd.trim());	}

	@Test
	void testToCharArray() {
		String woRd = "HelLo";
		char[] exp = {'H','e','l','L','o'};
		assertArrayEquals(exp, woRd.toCharArray());	}

	@Test
	void testFormatStringObjectArray() {
		String f = "I Like %s %s %s.";
		String[] objFormat = {"the", "New", "Year"};
		assertEquals("I Like the New Year.", String.format(f, objFormat));	}

}