package lsystems;

public class A_BC extends LRule {
	
	public A_BC() {
		this.match = 'A';
		this.body = new char[] {'B', 'C'};
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
