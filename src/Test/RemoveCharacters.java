package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveCharacters {
	
	Junit j=new Junit();
	
	@Test
	public void testRemoveCharacters() {
		assertEquals("BCDD",j.removeFisrt2("BCDD"));
	}
	
	@Test
	public void testCase2() {
		assertEquals("BCD",j.removeFisrt2("ABCD"));
	}	

	@Test
	public void testCase3() {
		assertEquals("CD",j.removeFisrt2("AACD"));
	}
	
	@Test
	public void testCase4() {
		Junit j=new Junit();
		assertEquals("BCD",j.removeFisrt2("BACD"));
	}
	
	@Test
	public void testCase5() {
		assertEquals("BBAA",j.removeFisrt2("BBAA"));
	}	
	
	@Test
	public void testCase6() {
		assertEquals("BAA",j.removeFisrt2("AABAA"));
	}	
	
	@Test
	public void testEmptyCharacter() {
		assertEquals("",j.removeFisrt2(""));
	}	
	
	@Test
	public void test1Character() {
		assertEquals("",j.removeFisrt2("A"));
	}

	@Test
	public void test2Character() {
		assertEquals("",j.removeFisrt2("AA"));
	}	
	
}
