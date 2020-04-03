package lsystems;

public class A_X extends LRule {
	
	public A_X() {
		this.match = 'A';
		this.body = new char[] {};
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
