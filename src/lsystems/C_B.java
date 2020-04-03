package lsystems;

public class C_B extends LRule {
	
	public C_B() {
		this.match = 'C';
		this.body = new char[] {'B'};
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
