package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_BTest {

	private LRule cB = new C_B();

	@Test
	public void testGetMatchMethod() {
		assertEquals('C', cB.getMatch());
	}
	
	@Test
	public void testGetBodyMethod() {
		char[] body = cB.getBody();
		assertArrayEquals(body, cB.getBody());
	}
	
	@Test
	public void testInstanceOf() {
		assertEquals(true, cB instanceof LRule);
	}

}
