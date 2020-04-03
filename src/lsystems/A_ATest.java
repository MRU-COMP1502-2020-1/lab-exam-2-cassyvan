package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ATest {
	
	private LRule a = new A_A();

	@Test
	public void testGetMatchMethod() {
		assertEquals('A', a.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = a.getBody();
		assertArrayEquals(body, a.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, a instanceof LRule);
	}

}
