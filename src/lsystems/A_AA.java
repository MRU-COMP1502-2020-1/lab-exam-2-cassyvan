package lsystems;

public class A_AA extends LRule {
	
	public A_AA() {
		this.match = 'A';
		this.body = new char[] {'A', 'A'};
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
