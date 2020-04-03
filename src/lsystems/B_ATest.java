package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_ATest {
	
	private LRule bA = new B_A();

	@Test
	public void testGetMatchMethod() {
		assertEquals('B', bA.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = bA.getBody();
		assertArrayEquals(body, bA.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, bA instanceof LRule);
	}

}
