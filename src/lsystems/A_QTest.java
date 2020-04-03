package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {
	
	private LRule aQ = new A_Q();

	@Test
	public void testGetMatchMethod() {
		assertEquals('A', aQ.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = aQ.getBody();
		assertArrayEquals(body, aQ.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, aQ instanceof LRule);
	}

}
