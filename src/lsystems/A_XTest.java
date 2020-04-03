package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_XTest {

	private LRule aX = new A_X();

	@Test
	public void testGetMatchMethod() {
		assertEquals('A', aX.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = aX.getBody();
		assertArrayEquals(body, aX.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, aX instanceof LRule);
	}

}
