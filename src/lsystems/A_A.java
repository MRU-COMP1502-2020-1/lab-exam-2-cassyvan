package lsystems;

public class A_A extends LRule {
	
	private char match;
	private char[]body;
	
	public A_A() {
		super();
		this.match = 'A';
		body = new char[] {'A'};
	}

	@Override
	public char getMatch() {
		return this.match;
	}

	@Override
	public char[] getBody() {
		return this.body;
	}

}
