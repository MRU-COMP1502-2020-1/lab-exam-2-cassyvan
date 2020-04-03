package lsystems;

public class A_Q extends LRule {
	
	public A_Q() {
		this.match = 'A';
		this.body = new char[] {'Q'};
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
