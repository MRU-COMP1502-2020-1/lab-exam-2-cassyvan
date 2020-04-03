package lsystems;

public class B_A extends LRule {
	
	public B_A() {
		this.match = 'B';
		this.body = new char[] {'A'};
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
