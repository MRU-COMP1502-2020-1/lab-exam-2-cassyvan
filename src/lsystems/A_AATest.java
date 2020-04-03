package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_AATest {

	private LRule aA = new A_AA();

	@Test
	public void testGetMatchMethod() {
		assertEquals('A', aA.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = aA.getBody();
		assertArrayEquals(body, aA.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, aA instanceof LRule);
	}
}
