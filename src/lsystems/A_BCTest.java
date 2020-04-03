package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_BCTest {

	private LRule aBC = new A_BC();

	@Test
	public void testGetMatchMethod() {
		assertEquals('A', aBC.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = aBC.getBody();
		assertArrayEquals(body, aBC.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, aBC instanceof LRule);
	}

}
